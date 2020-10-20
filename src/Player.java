import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;


public class Player implements Serializable {

    private static AbstractList<Player> currentPlayers;
    private String name;
        private int wins;
        private int totalPlayed;



    public Player (String name, int wins, int totalPlayed) {

            this.name = name;
            this.wins = wins;
            this.totalPlayed = totalPlayed;


        }

        public static void start() throws IOException, ClassNotFoundException {
             Player.currentPlayers = loadPlayersFromFile();
        }
/*
        public ArrayList<Player> getPlayer(ArrayList<Player> currentPlayers){

        for(int i=0;i<currentPlayers.size()-1;i++){

        }

        }

 */




         public static void savePlayersToFile(ArrayList<Player> currentPlayers) throws IOException {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("storedPlayers.txt"));
            output.writeObject(currentPlayers);
            System.out.print(currentPlayers);
            output.close();

        }

        public ArrayList<Player> loadPlayersFromFile() throws IOException, ClassNotFoundException {
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
