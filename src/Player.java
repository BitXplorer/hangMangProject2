import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Player {

        private String name;
        private int wins;
        private int totalPlayed;




    public Player(String name, int wins, int totalPlayed) {
            this.name = name;
            this.wins = wins;
            this.totalPlayed = totalPlayed;

        }

         public static void saveToFile(ArrayList<Player> playerList) throws FileNotFoundException {
            File storedPlayers = new File ("storedPlayers.txt");
            PrintWriter out = new PrintWriter(storedPlayers);
            out.println(playerList);
            out.close();

        }


        public String toString(){
            return "Name: " + name + ", " +
                    "Wins: " + wins + ", " +
                    "Games played: " + totalPlayed + "\n";

        }
}
