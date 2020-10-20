import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException,ClassNotFoundException {

        Player.start();


        Player p1 = new Player("Woop",5,10);
        Player p2 = new Player("test2",30,40);
        Player p3 = new Player("Harry",3,5);

        //Player.addPlayer(p2);
        Player.showAllPlayers();
        //Player.savePlayersToFile();

        Player.savePlayersToFile();









    }
}
