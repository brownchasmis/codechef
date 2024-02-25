/*
Difficulty:1069
Problem:PRIME1
Date: 25 Feb 2024
Author: Shatakshi Singh
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            for (int i = m; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
