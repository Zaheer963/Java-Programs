import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int num = 1, r = 0, m = 0;
        for(int i=0; i<n-1; i++)
        {
            if(a[i] == num) num++;
            else m = num;
            if(a[i] == a[i+1]) r = a[i];
        }
        System.out.print(r+" "+m);
    }
}