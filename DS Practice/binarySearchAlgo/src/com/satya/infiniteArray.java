package com.satya;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/#:~:text=If%20the%20array%20is%20infinite%2C%20that%20means%20we,array%2C%20Now%20compare%20key%20with%20high%20index%20element%2C
public class infiniteArray {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){

        int start = 0;
        int end = 0;
        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }

        return -1;
    }
}
