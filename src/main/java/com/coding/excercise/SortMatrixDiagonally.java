package com.coding.excercise;

import java.util.*;
/*Given a m x n matrix matrix of integers, sort it diagonally in ascending order from the top-left to the bottom-right then return the sorted array.*/
public class SortMatrixDiagonally {
    public static void sortIntMatrixDiagonally(int[][] matrix){
        int m= matrix.length;//num of rows
        int n = matrix[0].length;//num of columns
        HashMap<Integer,List<Integer>> hm = new HashMap<Integer,List<Integer>>();
        int diff;
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                diff=i-j;
                if(!hm.containsKey(diff)){
                    List<Integer> diagList = new ArrayList<Integer>();
                    diagList.add(matrix[i][j]);
                    hm.put(diff,diagList);
                }
                else{
                    List<Integer> diagList = hm.get(diff);
                    diagList.add(matrix[i][j]);
                    hm.put(diff,diagList);
                }
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry : hm.entrySet()){
            List<Integer> diagList = entry.getValue();
            Collections.sort(diagList);
            hm.put(entry.getKey(),diagList);
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                diff= i-j;
                List<Integer> sortedDiagList = hm.get(diff);
                int ele = sortedDiagList.get(0);
                sortedDiagList.remove(0);
                hm.put(diff,sortedDiagList);
                matrix[i][j]=ele;
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String ...args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.print("Enter the elements of Matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After sorting diagonally: ");
        sortIntMatrixDiagonally(matrix);
    }

}
