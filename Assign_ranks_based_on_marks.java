import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(a[i] >= 85 && a[i] <= 100) System.out.print(1+" ");
            else if(a[i] >= 70 && a[i] <= 84) System.out.print(2+" ");
            else if(a[i] >= 60 && a[i] <= 69) System.out.print(3+" ");
            else if(a[i] >= 36 && a[i] <= 59) System.out.print(4+" ");
            else if(a[i] >= 0 && a[i] <= 35) System.out.print(5+" ");
        }
    }
}