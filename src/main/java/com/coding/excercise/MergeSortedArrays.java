package com.coding.excercise;

import java.util.Arrays;

public class MergeSortedArrays {

/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.*/
public static int[] merge(int[] num1, int[] num2) {

    int[] result = new int[num1.length + num2.length];
    int i = 0, j = 0, k = 0;
    while (i < num1.length && j < num2.length)
    {
        if (num1[i] < num2[j])
        {
            result[k] = num1[i];
            i++;
        }
        else
        {
            result[k] = num2[j];
            j++;
        }
        k++;
    }

    while (i < num1.length)
    {
        result[k] = num1[i];
        i++;
        k++;
    }

    while (j < num2.length)
    {
        result[k] = num2[j];
        j++;
        k++;
    }

    return result;
}

public static void main(String[] args) {

	int[] number1 = {1,2,4,7,10};
	int[] number2 = {3,5,7};
	System.out.println("First array"+Arrays.toString(number1));
	System.out.println("Second array"+Arrays.toString(number2));
	int[] resultedArray = merge(number1, number2);
	System.out.println("Resulted array"+Arrays.toString(resultedArray));
}
}
