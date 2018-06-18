package com.company;


//Daily Coding Problem #158
//You are given an N by M matrix of 0s and 1s.
// Starting from the top left corner, how many ways
// are there to reach the bottom right corner?
//You can only move right and down. 0 represents
// an empty space while 1 represents a
// wall you cannot walk through.
public class Main {

    public static void main(String[] args) {
        int[][] testMatrix = {
                {0, 0, 1},
                {0, 0, 1},
                {1, 0, 0}
        };
        System.out.println(solution(testMatrix));
    }

    public static int solution(int[][] input) {
        return worker(input, 0, 0, input.length - 1);
    }

    public static int worker(int[][] matrix, int x, int y, int edge) {
        if (x == y && x == (edge)) return 1;
        int paths = 0;
        if (x != edge && matrix[x + 1][y] == 0) paths += worker(matrix, x + 1, y, edge);
        if (y != edge && matrix[x][y + 1] == 0) paths += worker(matrix, x, y + 1, edge);
        return paths;
    }
}
