package com.satya;

public class findNoOfEvenNumbers {
    public static void main(String[] args) {

        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {

        int count = 0;
        for(int element : nums){
            if(findit(element)) count++;
        }
        return count;
    }

    public static boolean findit(int element){
        int n = findDigit(element);

        return (n & 1) != 1;
    }

    public static int findDigit( int element){
        if(element == 0) return 1;
        if(element < 0) element = element * -1;
        return (int)(Math.log10(element)) + 1;
    }

}
