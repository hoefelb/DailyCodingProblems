package com.company;

import java.util.Stack;

//Daily Coding Problem #163
//Given an arithmetic expression in Reverse Polish
//Notation, write a program to evaluate it.
public class Main {

    public static void main(String[] args) {
    String[] testArray = {"15","7","1","1","+","-","/", "3", "*", "2", "1","1","+","+","-"};
    solution(testArray);
    }


    //Stack info supplied by https://en.wikipedia.org/wiki/Reverse_Polish_notation
    public static void solution(String[] input){
        Stack<Integer>  inputStack = new Stack<>();
        for (String s: input){
            if (s.equals("+")){
                inputStack.push(inputStack.pop()+inputStack.pop());
            }
            else if (s.equals("-")){
                inputStack.push((-1*inputStack.pop())+inputStack.pop());
            }
            else if (s.equals("*")){
                inputStack.push(inputStack.pop()*inputStack.pop());
            }
            else if (s.equals("/")){
            int i =  inputStack.pop();
            inputStack.push(inputStack.pop()/i);
            }
            else inputStack.push(Integer.parseInt(s));
        }
        System.out.print(inputStack.peek());
    }
}
