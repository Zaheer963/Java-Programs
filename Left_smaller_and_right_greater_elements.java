import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        int f = 0;
        for(int i=1; i<n-1; i++)
        {
            int l = a[i-1];
            int r = a[i+1];
            if(a[i] >= l && a[i] <= r)
            {
                System.out.print(a[i]);
                f = 1;
                break;
            }
        }
        if(f == 0) System.out.print(-1);
    }
}