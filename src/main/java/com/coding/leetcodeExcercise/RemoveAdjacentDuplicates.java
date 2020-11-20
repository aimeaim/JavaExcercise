package com.coding.leetcodeExcercise;

import java.util.*;
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
public class RemoveAdjacentDuplicates {
    public static void removeKAdjacentDuplicates(String str, int k){
        Stack<Character> charStk = new Stack<Character>();
        Stack<Integer> countStk = new Stack<Integer>();

        for(char c : str.toCharArray()){
            if(charStk.isEmpty() || c!=charStk.peek()){
                charStk.push(c);
                countStk.push(1);
            }
           else {
                int count = countStk.pop()+1;
                if(count == k)
                    charStk.pop();
                else {
                    countStk.push(count);
                }
            }
        }
        StringBuilder sbr = new StringBuilder();
        while(!charStk.isEmpty()){
            int count = countStk.pop();
            char ch= charStk.pop();
            for(int i=0;i<count;i++){
                sbr.append(ch);
            }
        }
        System.out.print(sbr.reverse());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:  ");
        String str= sc.next();
        System.out.print("Enter the value of k:  ");
        int k = sc.nextInt();
        System.out.print("After removing k adjacent dulipcates :  " );
        removeKAdjacentDuplicates(str,k);
    }
}
