package com.bridgelabz;

public class BinarySearchWord {
        static int binarySearch(String[] arr, String x) {
            int i = 0, l = arr.length - 1;
            while (i <= l) {
                int m = i + (l - i) / 2;
                int res = x.compareTo(arr[m]);
                if (res == 0)
                    return m;
                if (res > 0)
                    i = m + 1;
                else
                    l = m - 1;
            }
            return -1;
        }

        public static void main(String[] args) {
            String[] arr = {"abc", "acb", "bac", "bca", "cab", "cba"};
            String x = "cab";
            int result = binarySearch(arr, x);
            if (result == -1)
                System.out.println(x + " Element not present");
            else
                System.out.println("\"" + x + "\"" + " Element found at " + "index " + result);
        }
    }
