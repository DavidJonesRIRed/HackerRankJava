package com.company.Java.JavaStdinStdout;

import java.util.Scanner;

public class JavaStdinStdout {
    public JavaStdinStdout(){

    }

    public void printOut(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
