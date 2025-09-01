import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int th = sc.nextInt();
        int d = 0;
        while(n != 0)
        {
            int m = n % 10;
            if(m > th) d++;
            n /= 10;
        }
        if(d == 0) System.out.print(-1);
        else System.out.print(d);
    }
}