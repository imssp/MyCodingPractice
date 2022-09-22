package com.satya;

public class Main {
    public static void main(String[] args) {

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)  return -1;
        int r = getBucketCount(height * width, areaPerBucket) - extraBuckets;
        return r;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0)  return -1;
        int r = getBucketCount(height * width, areaPerBucket);
        return r;

    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0)  return -1;
        int count = 0;
        while(area > 0){
            area = area - areaPerBucket;
            count++;
        }
        return count;
    }
}
