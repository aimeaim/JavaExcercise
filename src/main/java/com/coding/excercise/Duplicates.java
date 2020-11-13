package com.coding.excercise;

import java.util.*; 
class Duplicates { 

	public static void printDuplicateCharactersUsingCollection(String str) 
	{ 
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		char[] charArray = str.toCharArray(); 
		for (char c : charArray) { 

			if (map.containsKey(c)) { 

				map.put(c, map.get(c) + 1); 
			} 
			else { 

				map.put(c, 1); 
			} 
		} 

		for (Map.Entry<Character, Integer> entry : 
			map.entrySet()) { 

			if (entry.getValue() > 1) { 
				System.out.println(entry.getKey() 
						+ " : "
						+ entry.getValue()); 
			} 
		} 
	} 

	public static void main(String args[]) 
	{ 
		String str = "My name is Emma"; 

		// Function Call 
		printDuplicateCharactersUsingCollection(str.replaceAll(" ", "").toLowerCase()); 
	} 
} 