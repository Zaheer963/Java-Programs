import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0)
        {
            int m = n % 10;
            if(m % 2 == 0)
            {
                m *= 2;
                String l = String.valueOf(m);
                int cm = Integer.parseInt("" + l.charAt(l.length()-1));
                sum += cm;
            }
            else sum += m;
            n /= 10;
        }
        System.out.print(sum);
    }
}