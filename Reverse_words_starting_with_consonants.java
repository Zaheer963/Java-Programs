import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String word[] = s.split(" ");
        int v=0;
        for(int i=0; i<word.length; i++)
        {
            char ch = word[i].charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch               == 'O' || ch == 'U')
                v++;
        }
        if(v==0)
            System.out.print("No Vowel Starting Word is present in String");
        else
        {
            for(int i=0; i<word.length; i++)
            {
                char ch = word[i].charAt(0);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'                    || ch == 'O' || ch == 'U')
                    System.out.print(word[i]+" ");
                else
                {
                    StringBuilder sb = new StringBuilder(word[i]);
                    System.out.print(sb.reverse()+" ");
                }
            }
        }
}
}