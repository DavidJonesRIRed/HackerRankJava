package com.company;
import java.lang.reflect.Array;

import static java.lang.System.out;

public class AppleAndOranges {
    private int startOfHouse;
    private int endOfHouse;
    private int locationOfAppleTree;
    private int locationOfOrangeTree;
    private int[] locationOfAppleDrops;
    private int[] locationOfOrangeDrops;
    private int applesThatAreClose;
    private int orangesThatAreClose;

    public AppleAndOranges(){
        this.startOfHouse = 0;
        this.endOfHouse = 0;
        this.locationOfAppleTree = 0;
        this.locationOfOrangeTree = 0;
        //this.locationOfAppleDrops = new int[];
        //this.locationOfOrangeDrops;
        this.applesThatAreClose = 0;
        this.orangesThatAreClose = 0;
    }

    public void countApplesAndOranges(int startingPoint, int endPoint, int locationOfAppleTree, int locationOfOrangeTree, int[] apples, int[] oranges){
        this.startOfHouse = startingPoint;
        this.endOfHouse = endPoint;
        this.locationOfAppleTree = locationOfAppleTree;
        this.locationOfOrangeTree = locationOfOrangeTree;
        this.locationOfAppleDrops = apples;
        this.locationOfOrangeDrops = oranges;

        for(int i = 0; i < this.locationOfAppleDrops.length; i++){
            int distance = this.locationOfAppleTree + this.locationOfAppleDrops[i];
            if(distance >= startOfHouse && distance <= endOfHouse){
                this.applesThatAreClose++;
            }
        }

        for(int i = 0; i < this.locationOfOrangeDrops.length; i++){
            int distance = this.locationOfOrangeTree + this.locationOfOrangeDrops[i];
            if(distance >= startOfHouse && distance <= endOfHouse){
                this.orangesThatAreClose++;
            }
        }

        out.println(this.applesThatAreClose);
        out.println(this.orangesThatAreClose);



    }
}
