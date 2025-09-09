import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int flipVal = 0, orgVal = 0;
        for(int i=0; i<n; i++)
        {
            flipVal += 9 - arr[i];
            orgVal += arr[i];
        }
        int sum = flipVal - orgVal;
        System.out.print((sum < 0)? sum *= -1 : sum);
    }
}