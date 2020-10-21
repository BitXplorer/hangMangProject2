import java.io.*;


public class Main {


    public static void main(String[] args) throws IOException,ClassNotFoundException {

        Player.start();


        Player p1 = new Player("Woop",5,10);
        String p2 = "test1";
        Player p3 = new Player("Harry",3,5);

        //Player.newPlayer(p2);
        Player.showAllPlayers();

        //Player.savePlayersToFile();









    }
}
