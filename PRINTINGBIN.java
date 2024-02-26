/*
Difficulty:1130
Problem:PRINTINGBIN
Date: 26 Feb 2024
Author: Shatakshi Singh
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int len = sc.nextInt();
            int arr[] = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < len; i++) {

                if (arr[i] == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
