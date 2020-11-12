package com.coding.excercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {
	public static char firstNonRepeatedCharacter(String word) {
        Map<Character,Integer> scoreboard = new LinkedHashMap<Character,Integer>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.containsKey(c)) {
                scoreboard.put(c, scoreboard.get(c) + 1);
            } else {
                scoreboard.put(c, 1);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (scoreboard.get(c) == 1) {
                return c;
            }
        }
        return 	'\u0000';
    }


	public static void main(String[] args) {
		 
		String str = "My name is Emma"; 

		// Function Call 
		System.out.println(firstNonRepeatedCharacter(str.toLowerCase().replaceAll(" ", "")));
	
	}

}
