package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Daily Coding Problem # 165
//Given an array of integers, return a new array
// where each element in the new array is the number of smaller elements
// to the right of that element in the original input array.
//For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0]
public class Main {

    public static void main(String[] args) {
        int[] testArray = {3, 4, 9, 6, 1};
        solution(testArray);
    }

    public static int[] solution(int[] intArray) {
        int[] solArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            int currentNum = intArray[i];
            int lessCount = 0;
            for (int j = i; j < intArray.length; j++) {
                if (currentNum > intArray[j]) lessCount++;
            }
            solArray[i] = lessCount;
        }
        System.out.print("Solution: [ ");
        for (int i : solArray) System.out.print(i + " ");
        System.out.print("]");
        return solArray;
    }
}
