import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int lv=0,uv=0,lc=0,uc=0,d=0,sp=0,sps=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            lv++;
            else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            uv++;
            else if(ch>='a' && ch<='z')
            lc++;
            else if(ch>='A' && ch<='Z')
            uc++;
            else if(ch>='0' && ch<='9')
            d++;
            else if(ch==' ')
            sp++;
            else
            sps++;
        }
        System.out.println(lv);
        System.out.println(uv);
        System.out.println(lc);
        System.out.println(uc);
        System.out.println(d);
        System.out.println(sps);
        System.out.println(sp);
    }
}