/*
Difficulty:1198
Problem:1198
Date: 27 Feb 2024
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

            Arrays.sort(arr);
            for (int i = 0; i < len - 1; i++) {
                if (i % 2 == 0) {
                    if (arr[i] <= arr[i + 1]) {
                        continue;
                    }
                    else {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
                else {
                    if (arr[i] >= arr[i + 1]) {
                        continue;
                    }
                    else {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
