package com.company;
import java.util.HashMap;


//Daily Coding Problem #155
//Given a list of elements, find the majority element
//which appears more than half the times
public class Main {

    public static void main(String[] args) {
        int[] testArray = {1, 2, 1, 1, 3, 4, 0};
        solution(testArray);
    }

    public static void solution(int[] list) {
        int greaterThanHalf = Math.floorDiv(list.length, 2);
        HashMap<Integer, Integer> instanceMap = new HashMap<>();
        for (int i : list) {
            if (instanceMap.containsKey(i)) instanceMap.put(i, 1 + instanceMap.get(i));
            else instanceMap.put(i, 1);
            if (instanceMap.get(i) == greaterThanHalf) {
                System.out.println(i);
                return;
            }

        }
    }
}
