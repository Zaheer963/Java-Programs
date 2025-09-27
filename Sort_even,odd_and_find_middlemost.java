import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int eo[] = new int[n];
        boolean allEven = false, allOdd = false;
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0) allEven = true;
            else allOdd = true;
        }
        Arrays.sort(a);
        int idx = 0;
        for(int i=0; i<n; i++) if(a[i] % 2 == 0) eo[idx++] = a[i];
        for(int i=n-1; i>=0; i--) if(a[i] % 2 == 1) eo[idx++] = a[i];
        if(n % 2 == 1) System.out.print(eo[n/2]);
        else
        {
            int EMid1 = eo[(n/2) - 1];
            int EMid2 = eo[n/2];
            System.out.print((EMid1 > EMid2)? EMid1 : EMid2);
        }
    }
}