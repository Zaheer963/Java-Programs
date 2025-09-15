import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                String up = ch+"";
                System.out.print(up.toUpperCase());
            }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                String lw = ch+"";
                System.out.print(lw.toLowerCase());
            }
            else
                System.out.print(ch);
        }
    }
}