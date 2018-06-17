package com.company;

//Daily Coding Problem #162
//Given a list of words
//return the shortest unique prefix of each word.

public class Main {

    public static void main(String[] args) {
        String[] testInput = {"dog", "cat", "apple", "apricot", "fish"};
        solution(testInput);
    }

    //A much faster solution can be achieved using tries,
    //but was not implemented due to little java trie support
    public static void solution(String[] input) {
        String[] returnList = new String[input.length];
        int arrayPos = 0;
        for (String s : input) {
            String currentString = "";
            for (int i = 0; i < s.length(); i++) {
                currentString = currentString + s.charAt(i);
                if (isUnique(input, currentString)) {
                    returnList[arrayPos] = currentString;
                    arrayPos++;
                    break;
                }

            }
        }

        for (String s : returnList){
            System.out.println(s);
        }
    }

    public static boolean isUnique(String[] input, String s) {
        int numInstances = 0;
        for (String string : input) {
            if (string.startsWith(s)) numInstances++;
        }
        return numInstances < 2;
    }
}
