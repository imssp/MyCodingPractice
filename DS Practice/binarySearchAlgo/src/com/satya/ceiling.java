package com.satya;

public class ceiling {
    public static void main(String[] args){

        int[] arr = {-18, -4, -2, 0, 2, 5, 15, 33, 47, 50, 61};
        int ans = Ceiling(arr, 62);
        System.out.println(ans);
    }

    public static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]) return -1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }

        return start;
    }
}
