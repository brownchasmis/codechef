/*
Difficulty:1142
Problem:SIMDISH
Date: 26 Feb 2024
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
		    String str[]=new String[4];
		    String str1[]=new String[4];
		    
		    for(int i=0;i<4;i++){
		        str[i]=sc.next();
		    }
		    
		    for(int i=0;i<4;i++){
		        str1[i]=sc.next();
		    }
		    
		    int count=0;
		    for(int i=0;i<4;i++){
		        for(int j=0;j<4;j++){
		            if(str[i].equals(str1[j])){
		                count++;
		            }
		        }
		    }
		    
		    if(count>=2){
		        System.out.println("similar");
		    }
		    else{
		        System.out.println("dissimilar");
		    }
		}
	}
}
