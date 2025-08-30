import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for(int i=0; i<s; i++)
            a[i] = sc.nextInt();
        int end = a[s-1];
        for(int i=s-1; i>0; i--)
        {
            if(a[i-1] > end)
            {
                System.out.print(a[i-1]+" ");
                end = a[i-1];
            }
        }
    }
}