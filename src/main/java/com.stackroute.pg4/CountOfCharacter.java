/*
1. Write a java program to count the total number of occurrences of a given character in a string
        without using any loop?
        For Example- Java is java again java again count number of occurrence of a in the given string

*/

package com.stackroute.pg4;

public class CountOfCharacter {
    public static void main(String[] args) {
        String str = "Java is java again java again";
        int charcount = str.length() - str.replaceAll("a", "").length();
        System.out.println("Occurrence of a char in given String: " + charcount);
    }
}

