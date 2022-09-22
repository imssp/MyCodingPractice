package com.satya;

import java.util.Arrays;
import java.util.Scanner;

public class searchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        //System.out.println(search(str, ch));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search(String str, char ch) {
        if(str.length() == 0) return false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) return true;
        }
        return false;
    }

    static boolean search2(String str, char ch) {
        if(str.length() == 0) return false;

        for (char c : str.toCharArray()) {
            if (c == ch) return true;
        }
        return false;
    }
}