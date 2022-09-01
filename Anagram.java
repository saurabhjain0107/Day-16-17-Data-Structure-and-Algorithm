package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    private static void isAnagram() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String str1 = sc.nextLine().toLowerCase();
        System.out.print("Enter second string : ");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        } else {
            char[] s1Array = str1.toLowerCase().toCharArray();
            char[] s2Array = str2.toLowerCase().toCharArray();
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            if (Arrays.equals(s1Array, s2Array)) {
                System.out.println(str1 + " and " + str2 + " are anagrams");
            }
        }
    }
    public static void main(String[] args) {
        isAnagram();
    }
}
