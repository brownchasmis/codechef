import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int len = sc.nextInt();
            int[] arr = new int[len];
            int count_zero = 0;

            for (int i = 0; i < len; i++)
            {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) count_zero++;
            }

            int count_one = len - count_zero;
            int result = Math.min(count_zero, count_one);

            System.out.println(result);
        }
    }
}
