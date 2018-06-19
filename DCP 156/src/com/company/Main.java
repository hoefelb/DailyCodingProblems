package com.company;

import java.util.ArrayList;

//Daily Coding Problem #156
//Given a positive integer n, find
// the smallest number of squared
// integers which sum to n
public class Main {

    public static void main(String[] args) {
        System.out.println(solution(45288));
    }

    //Solution works, but only is capable of solving for small numbers
    public static int solution(int inupt) {
        ArrayList<Integer> possibleSquares = new ArrayList<>();
        int i = 1;
        while (true) {
            if ((i * i) < inupt) {
                possibleSquares.add(i * i);
                i++;
            } else break;
        }

        return worker(possibleSquares.toArray(new Integer[possibleSquares.size()]), possibleSquares.toArray(new Integer[possibleSquares.size()]), 0, inupt);

    }

    public static int worker(Integer[] Solutionarray, Integer[] squareArray, int numberSquares, int goalNumber) {
        for (int i : Solutionarray) {
            if (i == goalNumber) {
                return 1 + numberSquares;
            }
        }
        ArrayList<Integer> newSoluionArray = new ArrayList<>();
        for (int i : Solutionarray) {
            for (int j : squareArray) {
                newSoluionArray.add(i + j);
            }
        }
        return worker(newSoluionArray.toArray(new Integer[newSoluionArray.size()]), squareArray, numberSquares + 1, goalNumber);
    }
}
