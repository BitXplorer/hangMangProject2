import java.io.*;
import java.util.ArrayList;


public class Player implements Serializable {

        private String name;
        private int wins;
        private int totalPlayed;



    public Player (String name, int wins, int totalPlayed) {

            this.name = name;
            this.wins = wins;
            this.totalPlayed = totalPlayed;

        }

         public static void savePlayersToFile(ArrayList<Player> currentPlayers) throws IOException {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("storedPlayers"));
            //File savePlayers = new File ("storedPlayers.txt");
            //PrintWriter out = new PrintWriter(savePlayers);
            output.writeObject(currentPlayers);
            System.out.print(currentPlayers);
            output.close();

        }

        public static ArrayList<Player> loadPlayersFromFile() throws IOException, ClassNotFoundException {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("storedPlayers"));
            ArrayList<Player> loadedPlayers = new ArrayList<>();

            try (input){
                    Object player = input.readObject();
                    loadedPlayers = (ArrayList<Player>) player;
            } catch (IOException  e) {
                e.printStackTrace();
            }
            return loadedPlayers;
        }


        public String toString(){
            return "Name: " + name + ", " +
                    "Wins: " + wins + ", " +
                    "Games played: " + totalPlayed + "\n";

        }
}
