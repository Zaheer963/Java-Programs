import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean flag = false;
        for(int i=0; i<s1.length(); i++)
        {
            String c = ""+s1.charAt(i);
            if(s2.contains(c))
            {
                System.out.print("Yes");
                flag = true;
                break;
            }
        }
        if(!flag)
        System.out.print("No");
    }
}