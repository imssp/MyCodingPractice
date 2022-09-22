package com.satya;

public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(60300));
    }

    public static int getLargestPrime(int n){
        if(n < 2) return -1;
        for(int i = 2; i <= n; i++ ){
            while(n % i == 0){
                n = n / i;
            }
            if(n == 1) return i;
            else continue;
        }
        return -1;

    }

}
