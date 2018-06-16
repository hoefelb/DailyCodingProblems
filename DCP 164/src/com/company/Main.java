package com.company;

//Daily Coding Problem # 164
//You are given an array of length n + 1 whose elements belong to the set {1, 2, ..., n}.
//By the pigeonhole principle, there must be a duplicate. Find it in linear time and space.

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] intset = {8, 0, 6, 4, 2, 5, 7, 3, 1, 6};
        hashSolve(intset);
        sortSolve(intset);
        swapSolve(intset);
    }


    //original version. Should have linear time and space complexity.
    public static void hashSolve(int[] intset) {
        HashSet hash = new HashSet();
        for (int i : intset) {
            if (hash.contains(i)) {
                System.out.println(i + " is repeated");
                return;
            } else hash.add(i);
        }
    }

    //idea suggested at
    //https://leetcode.com/articles/find-the-duplicate-number/
    //Space complexity will be constant, but sorting will take
    //O(N lg(N)) time
    public static void sortSolve(int[] intset) {
        Arrays.sort(intset);
        int lastNum = -1;
        for (int i : intset) {
            if (i == lastNum) {
                System.out.println(i + " is repeated");
                return;
            }
            lastNum = i;
        }
    }

    //Swaps intset around so the each number is in its respective
    //place. If duplicates are found, the number is returned.
    // This might be linear time, and is constant space.
    public static void swapSolve(int[] intset) {
        for (int i = 0; i < intset.length - 1; i++) {
            while (intset[i] != i) {
                int x = intset[intset[i]];
                if (x == intset[i]) {
                    System.out.println(x + " is repeated");
                    return;
                }
                intset[intset[i]] = intset[i];
                intset[i] = x;
            }
            System.out.println(intset[intset.length - 1] + " is repeated");
        }

    }
}

