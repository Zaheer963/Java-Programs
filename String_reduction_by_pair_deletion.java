import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        String ss = new String(ch);
        int flag = 0;
        for(char c = 'a'; c<='z'; c++)
        {
            if(ss.indexOf(c) == -1)
            continue;
            else if(ss.indexOf(c) == ss.lastIndexOf(c))
            {
                System.out.print(c);
                flag++;
            }
            else
            {
                int pairs = ss.lastIndexOf(c)+1;
                if(pairs % 2 == 1)
                {
                    System.out.print(c);
                    flag++;
                }
            }
        }
        if(flag == 0)
        System.out.print("Empty String");
    }
}