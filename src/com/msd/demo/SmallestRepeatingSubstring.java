package com.msd.demo;

public class SmallestRepeatingSubstring {
    public static void main(String[] args) {
        String str = "abcababcababcab";
        String name="maysutmaysutmaysut";
        System.out.println(findSmallestRepeatingSubstring(name));
    }

    public static String findSmallestRepeatingSubstring(String s) {
        int n = s.length();

        // Try all possible substring lengths
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) { // length must divide the string
                String sub = s.substring(0, len);
                StringBuilder sb = new StringBuilder();

                // Repeat substring to build full string
                for (int i = 0; i < n / len; i++) {
                    sb.append(sub);
                }

                if (sb.toString().equals(s)) {
                    return sub;
                }
            }
        }
        return s; // If no repeating pattern found, return the string itself
    }
}
