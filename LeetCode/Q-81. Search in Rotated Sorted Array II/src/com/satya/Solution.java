package com.satya;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        int target = 7;
        System.out.println(search(arr, target));
    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivotWithDuplicate(nums);
        boolean flag = false;
        if(nums[pivot] == target) flag = true;
        int pos1 = binarySearch(target, 0, pivot, nums);
        int pos2 = binarySearch(target, pivot + 1, nums.length - 1, nums);
        if(pos1 != -1 || pos2!= -1) flag = true;
        return flag;
    }
    public static int binarySearch(int target, int start, int end, int[] arr){

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }

        return -1;
    }
    public static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1] ){
                    return start;
                }
                start++;
                if(arr[end] < arr[end -1]){
                    return end - 1;
                }
                end--;
            } else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
