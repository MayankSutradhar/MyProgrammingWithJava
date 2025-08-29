package com.msd.demo;

public class CompressCharacter {

	public static void main(String[] args) {
		 String str = "aabbabcc";
	     String compressedString = compress(str);
	     System.out.println(compressedString); // a3b3c2
	}
	public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i + 1 < str.length() && str.charAt(i + 1) == c) {
                count++;
            } else {
                sb.append(c);
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }
}
