import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z')
            {
                System.out.print("Lowercase Alphabet");
            }
            else if(ch>='A' && ch<='Z')
            {
                System.out.print("Uppercase Alphabet");
            }
            else if(ch>='0' && ch<='9')
            {
                System.out.print("Number");
            }
            else
            {
                System.out.print("Special Character");
            }
        }
    }
}