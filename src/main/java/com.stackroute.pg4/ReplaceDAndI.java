

/*
2. Write a program to replace all d with f and all l with t in the given String
        Input: daily dry
        Output: faity fry
        Original string: daily dry
        New String: faity fry
*/
package com.stackroute.pg4;
import java.util.*;
public class ReplaceDAndI {
    public static void main(String[] args)
    {
        System.out.println("Input:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.replace("d","f");
        str1=str1.replace("l","t");
        System.out.println("Output:" +str1);
        System.out.println("Original String:"+str);
        System.out.println("New String:"+ str1);

    }
}
