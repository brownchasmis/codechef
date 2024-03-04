/*
Difficulty:1135
Problem:EID
Date: 04 March 2024
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
		    int len=sc.nextInt();
		    int[] arr=new int[len];
		    for(int i=0;i<len;i++){
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int min=Integer.MAX_VALUE;
		    for(int i=0;i<len-1;i++){
		        int diff=arr[i+1]-arr[i];
		        if(diff<min){
		            min=diff;
		        }
		    }
		    System.out.println(min);
		}
	}
}
