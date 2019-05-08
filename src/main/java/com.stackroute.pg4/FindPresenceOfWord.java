/*
5. Write a program with the implementation of Regular Expression to find the presence of the name
        Harry in a string.
        Input: This is Harry.
        Output: Is Harry here ? true
        Input : This is Henry.
        Output: Is Harry here ? False
*/


package com.stackroute.pg4;

import java.util.Scanner;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;

public class FindPresenceOfWord {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter the string");
        String wholeString = in.nextLine();
        System.out.println("enter the pattern string");
        String patterString = in.next();

        // pattern contains what to match
        Pattern pattern = Pattern.compile(patterString);

        //matcher contains whole string
        Matcher matcher = pattern.matcher(wholeString);

        //if it is there it will be true
        if (matcher.find()) {
            System.out.println("Is " + patterString + " here ? : " +true);

        }

    }
}


