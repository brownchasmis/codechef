
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
            int days = sc.nextInt();
            String present = sc.next();
            int count_days = 0;
            for (int i = 0; i < days; i++) {
                char ch = present.charAt(i);
                if (ch == '1') {
                    count_days++;
                }
            }
            count_days = count_days + (120 - days);
            float percent = ((float)count_days / 120) * 100;
            if (percent >= 75) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
