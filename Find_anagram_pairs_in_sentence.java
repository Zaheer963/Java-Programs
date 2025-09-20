import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String word[] = s.split(" ");
        int flag=0;
        for(int i=0; i<word.length; i++)
        {
            for(int j=i+1; j<word.length; j++)
            {
                String s1 = word[i];
                String s2 = word[j];
                if(s1.length() == s2.length())
                {
                    char c1[] = s1.toLowerCase().toCharArray();
                    char c2[] = s2.toLowerCase().toCharArray();
                    Arrays.sort(c1);
                    Arrays.sort(c2);
                    if(Arrays.equals(c1,c2))
                    {
                        System.out.println(s1+" : "+s2);
                        flag++;
                    }
                }
            }
        }
        if(flag==0)
            System.out.print("No Anagrams Found");
    }
}