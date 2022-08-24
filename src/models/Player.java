package models;

public class Player {
    String name;
    Boolean hasWon;
    int position;
    public Player(String name){
        this.hasWon=false;
        this.position=0;
        this.name=name;
    }

    public Boolean getHasWon() {
        return hasWon;
    }

    public int getPosition() {
        return position;
    }

    public void setHasWon(Boolean hasWon) {
        this.hasWon = hasWon;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
}
