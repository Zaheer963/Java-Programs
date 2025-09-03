import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int pos = 1, sum = 0;
        while(n != 0)
        {
            int d = n % 10;
            sum += Math.pow(d,pos);
            pos++;
            n /= 10;
        }
        System.out.print(sum);
    }
}