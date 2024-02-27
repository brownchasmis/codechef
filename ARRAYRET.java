/*
Difficulty:1193
Problem:ARRAYRET
Date:27 Feb 2024
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
		    int lenA=sc.nextInt();
		    long B[] = new long[lenA];
		    for(int i=0;i<lenA;i++){
		        B[i]=sc.nextLong();
		    }
		    
		    long sumB=0;
		    for(int i=0;i<lenA;i++){
		        sumB+=B[i];
		    }
		    
		    long sumA=sumB/(long)(lenA+1);
		    
		    for(int i=0;i<lenA;i++){
		        System.out.print((B[i]-sumA)+" ");
		    }
		    System.out.println();
		}
	}
}
