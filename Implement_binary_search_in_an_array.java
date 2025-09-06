import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++) a[i] = sc.nextInt();
        int tar = sc.nextInt(), f = 0;
        int l = 0, h = n - 1;
        Arrays.sort(a);
        while(l <= h)
        {
            int mid = (l + h)/2;
            if(a[mid] == tar)
            {
                f = 1;
                break;
            }
            else if(tar < a[mid]) h = mid - 1;
            else l = mid + 1;
        }
        if(f == 0) System.out.print("Not Found");
        else System.out.print("Found");
    }
}