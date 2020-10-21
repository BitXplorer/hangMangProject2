import java.io.*;
import java.util.ArrayList;


public class Player implements Serializable {

        private static ArrayList<Player> currentPlayers = new ArrayList<>();
        private String name;
        private int wins;
        private int totalPlayed;



    public Player (String name, int wins, int totalPlayed) {
            this.name = name;
            this.wins = wins;
            this.totalPlayed = totalPlayed;
        }

        public static void start() throws IOException, ClassNotFoundException {
            currentPlayers = loadPlayersFromFile();
        }

        public static void newPlayer(String name){
            boolean doesExist = checkExistingPlayer(name);
            int wins = 0;
            int totalGamesPlayed = 0;
            Player currentPlayer = new Player(name,wins,totalGamesPlayed);

            if (!doesExist) {
                currentPlayers.add(currentPlayer);
            } else {
                loadPlayer(name);
            }
        }


        public static void showAllPlayers(){
            System.out.println(currentPlayers);
        }
        public String getName() {
            return name;
        }

        public static boolean checkExistingPlayer(String name) {
            for (Player i : currentPlayers) {
                if (i.getName() != null && i.getName().contains(name)) {
                    return true;
                }
            } return false;
        }


        public static Player loadPlayer(Player currentPlayer){
            int index = currentPlayers.indexOf(currentPlayer);
            Player existingPlayer = currentPlayers.get(index);
            return existingPlayer;
        }


         public static void savePlayersToFile() throws IOException {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("storedPlayers.txt"));
            output.writeObject(currentPlayers);
            output.close();
        }

        public static ArrayList<Player> loadPlayersFromFile() throws IOException, ClassNotFoundException {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("storedPlayers.txt"));
            ArrayList<Player> loadedPlayers = new ArrayList<>();

            try (input){
                    Object player = input.readObject();
                    loadedPlayers = (ArrayList<Player>) player;
            } catch (IOException  e) {
                e.printStackTrace();
            }
            return loadedPlayers;
        }

         @Override
         public String toString() {
             return "Name: " + name + ", " +
                     "Wins: " + wins + ", " +
                     "Games played: " + totalPlayed + "\n";

         }

}
