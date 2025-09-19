import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        s1 = s1.replace(" ","");
        s2 = s2.replace(" ","");
        if(s1.length() == s2.length())
        {
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char c1[] = s1.toCharArray();
            char c2[] = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1,c2))
            {
                System.out.print("Anagrams");
            }
            else
            {
                System.out.print("Not Anagrams");
            }
        }
    }
}