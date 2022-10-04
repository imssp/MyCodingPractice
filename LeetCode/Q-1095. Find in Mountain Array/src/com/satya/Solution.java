package com.satya;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int position = findInMountainArray(target, arr);
        System.out.println(position);
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakElement(mountainArr);
        int pos1 = findInIncreasingPart(target, peak, mountainArr);
        int pos2 = findInDecreasingPart(target, peak, mountainArr);
        if(pos1 != -1 && pos2 != -1){
            if(pos1 < pos2) return pos1;
            else return pos2;
        }else if(pos1 != -1){
            return pos1;
        } else if (pos2 != -1 ) {
            return pos2;
        } else {
            return -1;
        }
    }

    public static int findInIncreasingPart(int target, int peak, int[] arr){
        int start = 0;
        int end = peak;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) end = mid - 1;
            else if(target > arr[mid]) start = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static int findInDecreasingPart(int target, int peak, int[] arr){
        int start = peak + 1;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) end = mid - 1;
            else if(target < arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[mid] > nums[mid + 1]){
                end = mid;
            } else{
                start = mid + 1;
            }
        }
        return start;
    }

}
