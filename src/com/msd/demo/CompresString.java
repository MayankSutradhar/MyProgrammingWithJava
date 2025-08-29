package com.msd.demo;

import java.util.HashMap;
import java.util.Map;

public class CompresString {

	public static void main(String[] args) {
		String str = "aabbabcc";

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue());
        }

        System.out.println(sb.toString());
	}

}
