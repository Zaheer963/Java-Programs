import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int absDifSum = 0;
        for(int i=0; i<n-1; i++)
        {
            int a = arr[i], b = arr[i+1];
            int dif = a - b;
            if(dif < 0) dif *= -1;
            absDifSum += dif;
        }
        System.out.print(absDifSum);
    }
}