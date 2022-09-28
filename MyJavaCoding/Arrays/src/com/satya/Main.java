package com.satya;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++){
            System.out.println(myIntegers[i]);
        }
        System.out.println("average = " + getAverage(myIntegers));
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] myIntegers){
        int sum = 0;
        for (int i = 0; i < myIntegers.length; i++){
            sum += myIntegers[i];
        }
        return (double)sum / (double) myIntegers.length;
    }
}
