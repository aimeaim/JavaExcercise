package com.coding.excercise;

public class StringReversal {

    public static void main(String args[])  {

        //original string
        String str = "Reverse String in Java";
        System.out.println("Original String: " + str);
        
        //reverse words
        reverseWords(str);
        
        
        //recursive method to reverse String in Java
        String reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);


        //reversed string using Stringbuffer
        reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

        //iterative method to reverse String in Java
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

      
    }

    public static String reverse(String sampleString) {//reversal using Iteration
    	String resultedString = "";
    	for(int i=(sampleString.length()-1);i>=0;i--) {
    		resultedString=resultedString+sampleString.charAt(i);
    	}
    	return resultedString;
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
    
    private static void reverseWords(String sampleString) {
    	String[] splittedArray = sampleString.split(" ");
    	for(int i=(splittedArray.length-1);i>=0;i--) {
    		System.out.println(splittedArray[i]);
    	}
    }
}

