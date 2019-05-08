/*
6. Write a program to find out the multiple occurrences of the given word in a string using Matcher
        methods.
        Input : She sells seashells by the seashore
        Given word: se
        Output :
        Found at: 4 - 6

        Found at: 10 - 12
        Found at: 27 – 29
*/

package com.stackroute.pg4;
import java.util.Scanner;
import java.util.regex.*;

public class MultipleOccuranceUsingMatche {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(" enter the string");
        String wholeString = in.nextLine();
        System.out.println("enter the pattern string");
        String patternString = in.nextLine();

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(wholeString);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }

    }
}
