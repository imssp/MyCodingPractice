package com.satya;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        anotherIntValue++;
        System.out.println(myIntValue);
        System.out.println(anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray; //Both point to same address

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{4,5,6,7,8};//new keyword is used to dereference the array
        modifyAArray(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherIntArray));
    }

    private static void modifyAArray(int[] arr){
        arr[0] = 2;
        arr = new int[] {1,2,3,4,5};


    }
}
