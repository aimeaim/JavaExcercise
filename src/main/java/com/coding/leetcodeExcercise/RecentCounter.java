package com.coding.leetcodeExcercise;

import java.util.*;
//https://leetcode.com/problems/number-of-recent-calls
class RecentCounter {

    Queue<Integer> reqs;
    public RecentCounter() {
        reqs = new LinkedList<Integer>();
    }

    public int ping(int t) {
        reqs.add(t);
        while(reqs.peek() < t-3000)
            reqs.poll();
        return reqs.size();
    }
    public static void main(String ...args) {
        RecentCounter rc= new RecentCounter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the requests array size: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the requests list: ");
        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }

        int[] result = new int[len];
        for(int i=0;i<len;i++){
            result[i] = rc.ping(arr[i]);
        }
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+ " ");}
        System.out.println();
        for(int i=0;i<len;i++){
            System.out.print(result[i] + " ");}

    }
}