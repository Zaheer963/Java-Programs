import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int i = 0, j = n.length()-1, dc = 0;
        boolean palindrome = true;
        while(i <= j)
        {
            if(n.equals("0")) break;
            char ic = n.charAt(i);
            char jc = n.charAt(j);
            if(ic == jc)
            {
                if(ic == '0' && jc == '0') break;
                else if(ic == '0' || jc == '0') continue;
                else if(i == j) dc++;
                else dc += 2;
                i++;
                j--;
            }
            else 
            {
                palindrome = false;
                break;
            }
        }
        System.out.print((palindrome)? dc : 0);
    }
}