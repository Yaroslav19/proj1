package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void sort(String[] args) {
        Arrays.sort(args, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }


    public static void print(String[] args){
        for(int i = 0; i < args.length; i++)
        System.out.println(args[i]);
    }

    public static void main(String[] args) {
        args = new String[3];
        Scanner read = new Scanner(System.in);
        for(int i = 0; i < args.length; i++)
            args[i] = read.nextLine();

        sort(args);
        print(args);
    }
}
