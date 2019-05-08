/*
4. Write a program to transpose the given string.
        Input String : a quick brown fox jumps over the lazy dog
        Output String: a kciuq nworb xof spmuj revo eht yzal god
*/

package com.stackroute.pg4;
import java.util.Scanner;
public class TransposeString {
    public static void main(String[] args) {
        System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String str = read.nextLine();

        String[] arr = str.split(" ");

        StringBuffer newFullString = new StringBuffer();

       for (String word : arr) {

           StringBuffer newString = new StringBuffer();
           newString.append(word).reverse();
           newFullString.append(newString +" ");


       }
        System.out.print(newFullString);

    }

}
