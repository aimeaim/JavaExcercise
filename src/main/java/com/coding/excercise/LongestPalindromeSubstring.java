package com.coding.excercise;

//For given String consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
public class LongestPalindromeSubstring { 

	//to find substrings by comparing 1 left and 1 right
	private static String substringPalindrome(String str, int min, int max)  {
		int length = str.length();
		while((min>=0 && max<length) && (str.charAt(min)==str.charAt(max))) {
			min--;
			max++;
		}
		return str.substring(min+1,max);
	}

	//to find longest substrings
	private static String longestPalindrome(String givenString) {
		String str = givenString;
		String maxString="", curString;
		int maxLength = 0, curLength;
		int strLength = str.length();
		for(int i=0;i<strLength-1;i++)  {
			//for odd palindrome
			curString = substringPalindrome(str,i,i);
			curLength = curString.length();
			if(curLength>maxLength) {
				maxString = curString;
				maxLength = curLength;
			}

			//for even palindrome
			curString = substringPalindrome(str,i,i+1);
			curLength = maxString.length();
			if(curLength>maxLength) {
				maxString = curString;
				maxLength = curLength;
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		String givenString = "PQSRQRSQSRQQR";
		System.out.println("The longest palindrome substring : " + givenString + " is : "+ longestPalindrome(givenString));
	}

	}