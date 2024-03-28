package com.company.killoran;
import java.util.*;

class Main {
    public static void main(String[] args) {

        Games game1 = new Games(GameSystem.XBOX,"Halo 2");
        Games game2 = new Games(GameSystem.SWITCH,"Animal Crossing");
        Games game3 = new Games(GameSystem.PS5,"Spiderman - Miles Morales");
        Games game4 = new Games(GameSystem.XBOX,"Halo");
        Games game5 = new Games(GameSystem.PC,"Helldivers2");

        ArrayList<Games> myInventory = new ArrayList<>();
        myInventory.add(game1);
        myInventory.add(game2);
        myInventory.add(game3);
        myInventory.add(game4);
        myInventory.add(game5);

        Collections.sort(myInventory);

        for(int i=0; i < myInventory.size(); i++) {
            System.out.println(myInventory.get(i));
        }
    }
}


enum GameSystem {XBOX, PS5, SWITCH, PC};

class Games implements Comparable<Games> {
    private GameSystem system;
    private String title;

    public Games(GameSystem system, String title) {
        this.system = system;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Games{" +
                "system=" + system +
                ", title='" + title + '\'' +
                '}';
    }


    @Override
    public int compareTo(Games other) {
        //-1 returns first or less than
        //0 means equal
        //1 it goes last or towards the end!

        //type below first---
        if(this.system==other.system){
            return 0;
            //--alter above to sort by title if equal
            // --return this.title.compareTo(other.title);
        }
        else {
            return this.system.compareTo(other.system);
        }

    }
}


