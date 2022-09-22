package com.satya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of element: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Now enter the element you want to search: ");
        int target = in.nextInt();
        int pos = linearsearch(arr, target);
        if(pos == -1)
            System.out.println("Element not found.");
        else
            System.out.println("It is at the "+ pos + "th position in the array.");
    }

    static int linearsearch(int[] arr, int target){
        if(arr == null) return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i+1;
        }

        return -1;
    }
}
