import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int s = sc.nextInt();
        int[] a = new int[s];
        for(int i=0; i<a.length; i++)
            a[i] = sc.nextInt();
        
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
}