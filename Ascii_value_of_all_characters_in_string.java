import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length();i++)
        {
            int a = s.charAt(i);
            System.out.print(a+" ");
        }
    }
}