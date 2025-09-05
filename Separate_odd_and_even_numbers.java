import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        boolean e = false, o = false;
        ArrayList<Integer> earr = new ArrayList<>();
        ArrayList<Integer> oarr = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                earr.add(arr[i]);
                e = true;
            }
            else
            {
                oarr.add(arr[i]);
                o = true;
            }
        }
        if(o) for(int x : oarr) System.out.print(x+" ");
        else System.out.print("No odd elements");
        System.out.println();
        if(e) for(int x : earr) System.out.print(x+" ");
        else System.out.print("No even elements");
    }
}