package com.satya;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity){
        int[] arr = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0 ; i< sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
