package com.msd.java8;

import java.util.stream.IntStream;

public class SmallestRepeatingSubstring {
    public static void main(String[] args) {
        String str = "abcababcababcab";
        System.out.println(findSmallestRepeatingSubstring(str));
    }

    public static String findSmallestRepeatingSubstring(String s) {
        int n = s.length();

        return IntStream.rangeClosed(1, n / 2)
                .filter(len -> n % len == 0) // only divisors of n
                .mapToObj(len -> s.substring(0, len))
                .filter(sub -> s.equals(sub.repeat(n / sub.length())))
                .findFirst()
                .orElse(s); // if no repeating pattern, return whole string
    }
}

