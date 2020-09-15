package com.company;
//package com.company.*;

import com.company.JInherit1.Bird;
import com.company.JInherit2.Adder;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        //Apples and oranges Hacker Rank challenge

        AppleAndOranges myAAndO = new AppleAndOranges();

        int[] apples = {-2};
        int[] oranges = {-1};

        myAAndO.countApplesAndOranges(2,3,1,5,apples,oranges);

        apples = new int[]{-2, 2, 1};
        oranges = new int[]{5, -6};

        myAAndO.countApplesAndOranges(7,11,5,15,apples,oranges);
        */

        /*
        //Java inheritance
        Bird myBird = new Bird();
        myBird.walk();
        myBird.fly();
        myBird.sing();
        */

        //Java inheritance2
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");

    }
}
