package com.satya;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        reverse(arr);
    }
    private static void reverse(int[] arr1){
        System.out.println("Array = " + Arrays.toString(arr1));

        Scanner scanner = new Scanner(System.in);
        int maxIndex = arr1.length - 1;
        int halfLength = arr1.length / 2;

        for(int i = 0; i < halfLength; i++){
            int temp = arr1[i];
            arr1[i] = arr1[maxIndex - i];
            arr1[maxIndex - i] = temp;
        }

        System.out.println("Reversed Array = " + Arrays.toString(arr));
    }
}
