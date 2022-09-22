package com.satya;

public class Main {
    public static void main(String[] args) {

        int[][] aa = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(aa));
    }
    public static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;

        for(int[] person : accounts){
            int sum = 0;
            for(int account : person){
                sum += account;
            }
            if(sum > ans) ans = sum;
        }

        return ans;

    }
}
