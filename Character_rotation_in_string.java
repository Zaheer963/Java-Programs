import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        for(int i=0; i<s.length(); i++)
        {
            int a = s.charAt(i) + n;
            if(a > 122) a -= 26;
            char c = (char) a;
            System.out.print(c);
        }
    }
}