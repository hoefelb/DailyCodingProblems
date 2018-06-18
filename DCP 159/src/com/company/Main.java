package com.company;

import java.util.HashSet;

//Daily Coding Problem #159
//Given a string, return the first recurring character in it
//or null if there is no recurring chracter.
public class Main {

    public static void main(String[] args) {
    String testString = "abcbac";
    System.out.println(solution(testString));

    }

    public static Character  solution (String input){
        HashSet<Character> charsUsed = new HashSet<>();
        for (int i = 0; i < input.length();i++){
            if (charsUsed.contains(input.charAt(i))){
                return input.charAt(i);
            }
            else charsUsed.add(input.charAt(i));

        }
        return null;
    }
}
