package com.satya;

public class Main {
    public static void main(String[] args) {
        printSquareStar(5);

    }

    public static void printSquareStar(int n){
        if(n < 5) System.out.println("Invalid Value");
        else {
            for(int r = 1; r <= n; r++){
                for(int c = 1; c <= n; c++){
                    if(r==1 || c==1 || r == n || c == n) System.out.print("*");
                    else if(r == c) System.out.print("*");
                    else if(c == (n-r+1)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

}
