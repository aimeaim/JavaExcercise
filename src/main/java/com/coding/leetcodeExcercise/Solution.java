package com.coding.leetcodeExcercise;


import java.util.*;
// Task Scheduler - https://leetcode.com/problems/task-scheduler/
public class Solution {
    public static int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task - 'A']++;
        }
        Arrays.sort(freq);
        int chunk = freq[25] -1;
        int idleSpots= chunk * n;
        for(int i=24; i>=0 ;i--){
            idleSpots-= Math.min(freq[i],chunk);
        }
        return idleSpots < 0 ? tasks.length : idleSpots+tasks.length;
    }
    public static void main(String ...args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the task array size: ");
        int len = sc.nextInt();
        char[] taskArr = new char[len];
        System.out.print("Enter the tasks array: ");
        for(int i=0;i<len;i++){
            taskArr[i] = sc.next().charAt(0);
        }
        System.out.print("Enter cooldown period: ");
        int n = sc.nextInt();
        System.out.print("Least number of units of times that the CPU will take to finish all the given tasks : "+leastInterval(taskArr,n));
    }
}
