import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void addNewPlayers(ArrayList<Player> loadedPlayers){
        String name;
        int wins = 0;
        int totalPlayed = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Write your name: ");
        name = in.next();
        loadedPlayers.add(new Player(name,wins,totalPlayed));
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {

        Player.start();
        //currentPlayers = Player.loadPlayersFromFile();

        /*
        Player p1 = new Player("Test",5,10);
        Player p2 = new Player("test2",30,40);
        Player p3 = new Player("Harry",3,5);

        currentPlayers.add(p1);

         */
        //Player now = currentPlayers.get(0);


        //System.out.print(now.toString());


        //addNewPlayers(currentPlayers);

        //Player.savePlayersToFile();









    }
}
