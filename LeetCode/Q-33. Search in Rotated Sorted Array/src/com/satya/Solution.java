package com.satya;
//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 0;
        int position = search(arr, target);
        System.out.println(position);
    }
    public static int search( int[] nums, int target) {
        int pivot = findPivot(nums);
//        int pos1 = findInIncreasingPart(target, 0, pivot, nums);
//        int pos2 = findInIncreasingPart(target, pivot + 1, nums.length - 1, nums);
//        if(pos1 != -1) return pos1;
//        else if (pos2 != -1) return pos2;
//        else return -1;
        if(pivot == -1){
            return binarySearch(target, 0, nums.length, nums);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(target, 0, pivot - 1, nums);
        }
        else
            return binarySearch(target, pivot + 1, nums.length - 1, nums);
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
    public static int findPivot(int[] arr) {
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
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
