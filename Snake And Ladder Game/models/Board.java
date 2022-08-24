package models;

import java.util.*;

public class Board {
    static final int size = 100;
    int noOfSnake;
    int noOfladders;
    List<Snake>snakes;
    List<Ladder>ladders;
    public Board(int noOfSnake, int noOfladders){
        this.noOfSnake=noOfSnake;
        this.noOfladders=noOfladders;
        this.snakes=new ArrayList<>(noOfSnake);
        this.ladders=new ArrayList<>(noOfladders);
        init();
    }
    private void init(){
        HashSet<Integer> tes=new HashSet<>();
        Random random=new Random();

            for(int i=0;i< this.noOfSnake;i++){
                int snakeStart= random.nextInt(size-1)+1;
                int snakeEnd=random.nextInt(size-1)+1;
                if(snakeEnd>=snakeStart || tes.contains(snakeEnd) || tes.contains(snakeEnd)){
                    i--; continue;
                }
                Snake snake=new Snake(snakeStart,snakeEnd);
                System.out.println("snake added at " + snakeStart + " to " + snakeEnd);
                snakes.add(snake);
                tes.add(snakeStart);
                tes.add(snakeEnd);
            }
            for(int i=0;i< this.noOfladders;i++){
                int ladderStart= random.nextInt(size-1)+1;
                int ladderEnd=random.nextInt(size-1)+1;
                if(ladderEnd<=ladderStart || tes.contains(ladderStart) || tes.contains(ladderEnd)){
                    i--; continue;
                }
                System.out.println("Ladder added at " + ladderStart + " to " + ladderEnd);
                Ladder ladder=new Ladder(ladderStart,ladderEnd);
                ladders.add(ladder);
                tes.add(ladderStart);
                tes.add(ladderEnd);
            }
    }
    public int getSize(){
        return this.size;
    }

}
