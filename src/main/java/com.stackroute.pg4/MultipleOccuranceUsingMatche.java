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
