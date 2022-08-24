package models;

import java.util.Random;

public class Dice {
    int no;
    public int roll(){
        Random random= new Random();
        return this.no= random.nextInt(6)+1;
    }
}
