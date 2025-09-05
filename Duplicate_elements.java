import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        Set<Integer> ob = new LinkedHashSet<Integer>();
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            ob.add(a[i]);
        }
        for(int nodup : ob)
            System.out.print(nodup+" ");
    }
}