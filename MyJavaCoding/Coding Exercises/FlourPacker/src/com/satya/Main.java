package com.satya;

public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(-3, 2, 11));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        while(bigCount != 0){
            if(goal >= 5) goal = goal - 5;
            bigCount--;
        }

        if(smallCount >= goal) return true;
        else return false;

    }
}
