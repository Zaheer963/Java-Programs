import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String sr = s.replaceAll(" ","");
        int len = sr.length()-1;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ')
            {
                System.out.print(sr.charAt(len));
                len--;
            }
            else
            {
                System.out.print(" ");
            }
        }
    }
}