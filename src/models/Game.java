package models;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game {
    Board board;
    Queue<Player>players;
    Dice dice;

    public void addPlayerinGame(Player p){
        players.add(p);
    }
    public Game(int noOfsnakes,int noOfLadders){
        this.dice=new Dice();
        players=new ArrayDeque<>();
        this.board= new Board(noOfsnakes,noOfLadders);
    }

    public void play(){
        while(true){
            if(players.size()<2) break;
            Player curPlayer= players.poll();
            int newPosition= curPlayer.getPosition()+ dice.roll();
            if(newPosition>board.getSize()){
                players.offer(curPlayer); continue;
            } else if (newPosition== board.getSize()) {
                System.out.println(curPlayer.getName() + " has won!"); continue;
            }
            curPlayer.setPosition(updatePostion(newPosition,curPlayer));
            System.out.println(curPlayer.getName() +" reached at " + curPlayer.getPosition());
            players.offer(curPlayer);


        }
    }

    public int updatePostion(int pos, Player curPlayer){
        for(Snake snake: this.board.snakes){

            if(pos== snake.start) {
                System.out.println(curPlayer.getName() + "got Snake bites at ~~~~~~~~~~~~~~~ " + pos);
                return snake.end;
            }
        }
        for (Ladder ladder: this.board.ladders){

            if(pos== ladder.start) {
                System.out.println(curPlayer.getName() + " climbed Ladder at ############## " + pos);
                return ladder.end;
            }
        }
        return pos;
    }
}
