package com.coding.leetcodeExcercise;

import java.util.*;
public class RemoveOuterParathesis {
//https://leetcode.com/problems/remove-outermost-parentheses/
    public static void removeOuterParanthesis(String str){
        Stack<Character> charStack = new Stack<Character>();
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        indexList.add(-1);
        for(int i=0; i<str.length() ; i++){
            char chr = str.charAt(i);
            if(chr == '('){
                charStack.push(chr);
            }
            if(chr == ')'){
                charStack.pop();
            }
            if(charStack.empty()){
                indexList.add(i);
            }
        }
        StringBuilder sbr = new StringBuilder();
        sbr.append("");
        int[] indexArr = new int[indexList.size()];
        for(int i=0;i< indexArr.length; i++){
            indexArr[i] = indexList.get(i);
        }
        for(int i=0;i< indexArr.length -1; i++){
            sbr.append(str.substring(indexArr[i]+2,indexArr[i+1]));
        }
        System.out.print(sbr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a valid Parantheses string:  ");
        String str= sc.next();
        System.out.print("After removing outer parantheses :  " );
        removeOuterParanthesis(str);
    }
}
