import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = a*b;
        double max = (Math.pow(2,31) - 1);
        double min = -(Math.pow(2,31) - 1);
        if(c >= min && c <= max) System.out.print(c);
        else System.out.print(-1);
        
        
    }
}