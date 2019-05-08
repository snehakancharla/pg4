package com.stackroute.pg4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class SortWords {
    public static void main(String[] args) {

        String str = "Love myself I do. Not everything, but I love the good as well as the bad. I love my crazy lifestyle, and I love my hard discipline. I love my freedom of speech and the way my eyes get dark when I'm tired. I love that I have learned to trust people with my heart, even if it will get broken. I am proud of everything that I am and will become";
        String str1= str.toLowerCase();
        String[] arr = str1.split(" ");
        TreeSet<String> ts1 = new TreeSet<String>();
        for (String word : arr) {
            ts1.add(word);
        }
        System.out.println(ts1);
    }
}
