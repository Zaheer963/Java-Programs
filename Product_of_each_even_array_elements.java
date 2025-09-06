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
            int pro = 1;
            if(a[i] % 2 == 0)
            {
                f = 0;
                while(a[i] != 0)
                {
                    int d = a[i] % 10;
                    pro *= d;
                    a[i] /= 10;
                    f = 1;
                }
                if(f == 1) System.out.print(pro+" ");
            }
        }
        if(f == 0) System.out.print("No Even Elements");
    }
}