package com.satya;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int count = readIntegers();
        int[] returnedArray = readElements(count);
        int retuenMin = findMin(returnedArray);
        System.out.println(retuenMin);
    }
    private static int readIntegers(){
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int[] readElements(int count){
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; i++){
            int num = scanner.nextInt();
            scanner.nextLine();
            arr[i] = num;
        }
        return arr;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
}
