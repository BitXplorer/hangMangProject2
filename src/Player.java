import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player {

        private String name;
        private int wins;
        private int totalPlayed;



    public Player(String name, int wins, int totalPlayed) {
            this.name = name;
            this.wins = wins;
            this.totalPlayed = totalPlayed;

        }

         public static void savePlayersToFile(ArrayList<Player> playerList) throws FileNotFoundException {
            File savePlayers = new File ("storedPlayers.txt");
            PrintWriter out = new PrintWriter(savePlayers);
            out.println(playerList);
            out.close();

        }

        public ArrayList<Player> loadPlayersFromFile() throws FileNotFoundException{
            String name;
            int wins;
            int totalPlayed;
            ArrayList<Player> loadedPlayers = new ArrayList<Player>();
            String nameP = "Name:\\s(.*)\\,\\sWins:";
            String winsP = "Wins:\\s(.*)\\,\\s";
            String totalP = "played:\\s(.*)";
            Pattern namePattern = Pattern.compile(nameP);
            Pattern winsPattern = Pattern.compile(winsP);
            Pattern totalPlayedPattern = Pattern.compile(totalP);
            Scanner fileReader = new Scanner(new File("storedplayers.txt"));
            ArrayList<String> temp  = new ArrayList<>();

            while (fileReader.hasNextLine()){
                String read = fileReader.nextLine();
                temp.add(read);
            }

                    for (int i = 0; i<temp.size(); i++){
                        this.name = Pattern.matches(namePattern);
                        this.wins = Pattern.matches(winsPattern);
                        this.totalPlayed = Pattern.matches(totalPlayedPattern);
                        loadedPlayers.add();

                    }
                    return loadedPlayers;
        }


        public String toString(){
            return "Name: " + name + ", " +
                    "Wins: " + wins + ", " +
                    "Games played: " + totalPlayed + "\n";

        }
}
