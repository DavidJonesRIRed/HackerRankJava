package com.company.JavaLoops1;

public class JavaLoops1 {
    public JavaLoops1(){

    }

    public void timesTable(int num){
        int result = 0;
        for(int Times = 1; Times < 11; Times++){
            result = num * Times;
            System.out.println( num + " X " + Times + " = " + result);
        }
    }
}
