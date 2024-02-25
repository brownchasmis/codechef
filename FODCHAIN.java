/*
Difficulty:1062
Problem: FODCHAIN
Date: 25 Feb 2024
Author: Shatakshi Singh
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int e=sc.nextInt();
		    int k=sc.nextInt();
		    int count=0;
		    while(e>0){
		        e=e/k;
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
