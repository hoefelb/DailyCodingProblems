package com.company;

//Daily Coding Problem #161
//Given a 32-bit integer, return the number with its bits reversed
public class Main {

    public static void main(String[] args) {
        int testInt = 0xf0f0f0f0;
        solution(testInt);
    }

    //Question was unclear, so "bits reversed" was taken
    //as first nibble swapped with second nibble
    public static void solution(int input){
        int firstPart = input & 0xf0f0f0f0;
        int secondPart = input & 0x0f0f0f0f;

        int returnInt = ((firstPart>>4)& 0x0fffffff) + (secondPart<<4);
        System.out.println(Integer.toHexString(input));
        System.out.println(Integer.toHexString(returnInt));
    }
}
