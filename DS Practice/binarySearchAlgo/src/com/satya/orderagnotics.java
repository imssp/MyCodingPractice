package com.satya;

public class orderagnotics {
    public static void main(String[] args) {
        int[] arr = {61, 50, 47, 33, 15, 5, 2, 0, -2, -4, -18};
        int ans = binarySearch(arr, 61);
        System.out.println(ans);

        int[] arr2 = {-18, -4, -2, 0, 2, 5, 15, 33, 47, 50, 61};
        int ans2 = binarySearch(arr2, 61);
        System.out.println(ans2);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid + 1;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]) {
                    start = mid + 1;
                }
            }


        }

        return -1;
    }

}
