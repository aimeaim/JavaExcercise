package com.coding.excercise;

public class SubStringCheck {
	   public static void main(String[] args) {
		String sampleString = "HelloWorld";
		String subStringToCheck = "World";
		if(sampleString.contains(subStringToCheck)) {
			System.out.println("substring");
		} else {
			System.out.println("not a substring");
		}
	   }
	}