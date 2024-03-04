/*
Difficulty:1139
Problem:MDL
Date:04 Mar 2024
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
		    int[] temp=new int[len];
		    for(int i=0;i<len;i++){
		        arr[i]=sc.nextInt();
		        temp[i]=arr[i];
		    }
		    Arrays.sort(temp);
		    int x=0,j=0;
		    
		    for(int i=0;i<len;i++){
		        if(arr[i]==temp[0]){
		            x=i;
		        }
		        if(arr[i]==temp[len-1]){
		            j=i;
		        }
		    }
		    
		    if(x>j){
		        System.out.println(arr[j]+" "+arr[x]);
		    }
		    else{
		        System.out.println(arr[x]+" "+arr[j]);
		    }
		}
	}
}
