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

        Pattern pattern = Pattern.compile(patterString);
        Matcher matcher = pattern.matcher(wholeString);

        if (matcher.find()) {
            System.out.println("Is " + patterString + " here ? : " +true);

        }

    }
}


