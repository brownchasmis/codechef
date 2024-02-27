/*
Difficulty:1192
Problem:SHORTSPELL
Date:27 Feb 2024
Author: Shatakshi Singh
*/

//Correct solution(works for any string)
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int len = sc.nextInt();
            String str = sc.next();
            
            int max = 0;
            for (max = 0; max < n - 1; max++) {
                if (str.charAt(max) > str.charAt(max + 1)) {
                    break;
                }
            }
            
            for (int i = 0; i < n; i++) {
                if (max != i) {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
    }
}


//This solution is valid when string contains no duplicate characters such as "xxyy"
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
		    String str=sc.next();
		    int max=0;
		    
		    for(int i=0;i<len;i++){
		        int ch=(char)str.charAt(i);
		        if(ch>max){
		            max=ch;
		        }
		    }
		    
		    for(int i=0;i<len;i++){
		        int ch=(char)str.charAt(i);
		        if(ch==max){
		            continue;
		        }
		        else{
		            System.out.print((char)ch+"");
		        }
		    }
		    System.out.println();
		}
	}
}
