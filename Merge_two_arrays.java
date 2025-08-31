import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for(int i=0; i<n1; i++) a1[i] = sc.nextInt();
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for(int i=0; i<n2; i++) a2[i] = sc.nextInt();
        int n3 = n1+n2;
        int a3[] = new int[n1+n2];
        for(int i=0; i<n1; i++) a3[i] = a1[i];
        for(int i=0; i<n2; i++) a3[n1 + i] = a2[i];
        for(int i=0; i<n3; i++) System.out.print(a3[i]+" ");
    }
}