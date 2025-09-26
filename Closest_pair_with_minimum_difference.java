import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int min = 0, pair1 = 0, pair2 = 0;
        for(int i=0; i<n; i++) 
        {
            a[i] = sc.nextInt();
            min += a[i];
        }
        Arrays.sort(a);
        for(int i=0; i<n-1; i++)
        {
            int dif = a[i+1] - a[i];
            if(dif < min) 
            {
                min = dif;
                pair1 = a[i];
                pair2 = a[i+1];
            }
        }
        System.out.print(pair1+" "+pair2);
    }
}