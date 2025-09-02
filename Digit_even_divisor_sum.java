import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while(n != 0)
        {
            int d = n % 10;
            if(d == 0) sum += d ;
            else if(temp % d == 0 && d % 2 == 0) sum += d;
            n /= 10;
        }
        System.out.print(sum);
    }
}