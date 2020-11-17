package com.coding.excercise;

import java.util.HashSet;
import java.util.Set;

public class PalindromeSubstring { 
//to find substrings by comparing 1 left and 1 right

private static void substringPalindrome(String str, int min, int max, Set<String> set)  {
	int length = str.length();
	while((min>=0 && max<length) && (str.charAt(min)==str.charAt(max))) {
		set.add(str.substring(min,max+1));
		min--;
		max++;
	}
}

//to find all substrings
private static void substringsOfPalindrome(String givenString) {
	String str = givenString;
	int strLength = str.length();
	Set<String> substringSet = new HashSet<String>();
	for(int i=0;i<strLength;i++)  {
		//for odd palindrome
		substringPalindrome(str,i,i,substringSet);

		//for even palindrome
		substringPalindrome(str,i,i+1,substringSet);
	}
	System.out.println(substringSet);
}

public static void main(String[] args) {
	String givenString = "PQSRQRSQSRQQR";
	System.out.println("The palindrome substrings are " + givenString + " are : ");
	substringsOfPalindrome(givenString);
}

}