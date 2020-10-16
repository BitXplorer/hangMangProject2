import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

    public static void main(String[] args) throws FileNotFoundException {
        //ArrayList<Player> storedPlayers = readFromFile("storedPlayers.txt");
        ArrayList<Player> currentPlayers = new ArrayList<>();


        Player p1 = new Player("Dan",5,10);
        Player p2 = new Player("Antene",30,40);
        Player p3 = new Player("Joel",3,5);

        currentPlayers.add(p1);
        currentPlayers.add(p2);
        currentPlayers.add(p3);
        System.out.print(currentPlayers.toString());

        addNewPlayers(currentPlayers);

        System.out.println(currentPlayers);
        Player.savePlayersToFile(currentPlayers);









    }
}
