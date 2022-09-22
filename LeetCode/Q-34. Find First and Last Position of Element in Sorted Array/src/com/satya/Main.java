package com.satya;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Main {
    public static void main(String[] args) {

        int[] arr = {5,7,7,8,8,10};
        int[] ans = new int[2];
        ans = searchRange(arr,6);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        if(nums == null) return ans;
        int index1 = findIndex1(nums, target);
        int index2 = findIndex2(nums, target);
        return new int[]{index1, index2};
    }
    public static int findIndex1(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] >= target){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(nums[mid] == target) index = mid;
        }
        return index;
    }
    public static int findIndex2(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if(nums[mid] == target) index = mid;
        }
        return index;
    }

}
