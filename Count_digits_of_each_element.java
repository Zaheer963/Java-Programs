import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt(), f = 0;
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int digits = 0;
            if(a[i] == 0) digits++;
            else
            {
                while(a[i] != 0)
                {
                    digits++;
                    a[i] /= 10;
                }
            }
            System.out.print(digits+" ");
        }
    }
}