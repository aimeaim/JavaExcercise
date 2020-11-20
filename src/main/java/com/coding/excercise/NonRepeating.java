package com.coding.excercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//Find first non repeated character of String - Take sample String and print first non-duplicate character.
public class NonRepeating {
	public static int getfirstNonRepeatCharUsingCollection(String input) {
		char[] inputArray = input.toCharArray();
		Map<Character, Integer> charcount = new LinkedHashMap<Character, Integer>();
		for (char c : inputArray) {
			if (charcount.containsKey(c)) {
				charcount.put(c, charcount.get(c) + 1);
			} else {
				charcount.put(c, 1);
			}
		}
		int nonRepeatcharIndex = -1;

		for (Entry<Character, Integer> entrySet : charcount.entrySet()) {
			if (entrySet.getValue() == 1) {

				nonRepeatcharIndex = input.indexOf(entrySet.getKey());
				break;
			}
		}

		return nonRepeatcharIndex;
	}
	public static int getFirstNonRepeatChar(String input) {
		char[] inputArray = input.toCharArray();
		int nonRepeatcharIndex = -1;
		for (int i = 0; i < inputArray.length; i++) {
			char element = inputArray[i];
			boolean unique = true;
			for (int j = 0; j < inputArray.length; j++) {
				if (i != j) {
					if (element == inputArray[j]) {
						unique = false;
						break;
					}
				}
			}
			if (unique) {
				nonRepeatcharIndex = i;
				break;
			}
		}

		return nonRepeatcharIndex;}
	public static void main(String[] args) {
		 
		String str = "My name is Emma"; 
		int printFirstNonRepeatChar = getFirstNonRepeatChar(str.toLowerCase());
		// Function Call 
		if (printFirstNonRepeatChar != -1) {
			System.out.println("First Non Repeat Character : " + str.charAt(printFirstNonRepeatChar));
		}
		else{
			System.out.println("No repeating characters  in the string ");
		}
	
	}

}
