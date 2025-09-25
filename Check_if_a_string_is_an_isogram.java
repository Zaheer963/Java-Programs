import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine().toLowerCase();
        s = s.replaceAll(" ","");
        int flag = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(s.indexOf(c) != s.lastIndexOf(c))
            {
                flag++;
                break;
            }
        }
        if(flag == 0)
            System.out.print("Isogram");
        else
            System.out.print("Not Isogram");
    }
}