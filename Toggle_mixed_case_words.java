import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int lc = 0, uc = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z')
                lc++;
            else if(ch>='A' && ch<='Z')
                uc++;
        }
        if(lc == 0 || uc == 0)
            System.out.print("We Can't toggle");
        else
        {
            for(int i=0; i<s.length(); i++)
            {
                char ch = s.charAt(i);
                if(ch>='a' && ch<='z')
                {
                    String up = ch+"";
                    System.out.print(up.toUpperCase());
                }
                else if(ch>='A' && ch<='Z')
                {
                    String lw = ch+"";
                    System.out.print(lw.toLowerCase());
                }
                else
                    System.out.print(ch);
            }
        }
    }
}