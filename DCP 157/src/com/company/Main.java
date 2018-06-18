package com.company;

//Daily Coding Problem #157
//Given a string, determine
//whether any permutation of it is a palindrome.
public class Main {

    public static void main(String[] args) {
        String testString = "carrace";
        System.out.println(solution(testString));
    }

    public static boolean solution(String input){
        int[] alphabetRepetitions = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0 ; i < input.length(); i++){
            alphabetRepetitions[Character.toLowerCase(input.charAt(i))-'a']++;
        }
        int numberOddRepititions = 0;
        for(int i : alphabetRepetitions) {
            numberOddRepititions += (i % 2);
        }
        return numberOddRepititions < 2;
    }
}
