import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        int smax = 0,f = 0;
        for(int i=0; i<s; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=s-2; i>=0; i--)
        {
            if(a[i] != a[s-1])
            {
                smax = a[i];
                f = 1;
                break;
            }
        }
        if(f == 0) System.out.print("No Second Max");
        else System.out.print(smax);
        
    }
}