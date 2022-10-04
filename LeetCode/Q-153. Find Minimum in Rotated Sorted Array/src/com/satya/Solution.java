package com.satya;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class Solution {
    public static void main(String[] args) {
        int[] arr = {11,13,15,17};

        int n = findMin(arr);
        System.out.println(n);

    }

    public static int findMin(int[] nums) {
        int pivot = pivot(nums);

        if(pivot == -1) return nums[0];
        else return nums[pivot + 1];
    }

    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && nums[mid] > nums[mid + 1]) return mid;
            else if(mid > start && nums[mid] < nums[mid - 1]) return mid - 1;
            else if(nums[mid] <= nums[start]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
