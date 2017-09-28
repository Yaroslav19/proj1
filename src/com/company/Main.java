package com.company;

import java.util.Scanner;

public class Main {

    public static void print(String[] args){
        for(int i = 0; i < args.length; i++)
        System.out.println(args[i]);
    }

    public static void main(String[] args) {
        args = new String[3];
        Scanner read = new Scanner(System.in);
        for(int i = 0; i < args.length; i++)
            args[i] = read.nextLine();

        print(args);
    }
}
