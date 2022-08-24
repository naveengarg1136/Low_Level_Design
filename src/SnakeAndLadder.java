
import models.Game;
import models.Player;

public class SnakeAndLadder {
    public static void main(String[] args) {
        Game game=new Game(8,8);

        Player p1=new Player("Pramod");
        Player p2=new Player("Naveen");
        Player p3=new Player("Amit");
        Player p4=new Player("Sanya");

        game.addPlayerinGame(p1);
        game.addPlayerinGame(p2);
        game.addPlayerinGame(p3);
        game.addPlayerinGame(p4);

        game.play();
    }
}