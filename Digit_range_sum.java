import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), low = sc.nextInt(), high = sc.nextInt(), sum = 0;
        while(num != 0)
        {
            int d = num % 10;
            if(d >= low && d <= high) sum += d;
            num /= 10;
        }
        System.out.print(sum);
    }
}