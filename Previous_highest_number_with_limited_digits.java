import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String ntr = sc.next();
        for(int i=Integer.parseInt(s)-1; i>=0; i--)
        {
            if(String.valueOf(i).contains(ntr))
            {}
            else
            {
                System.out.print(i);
                break;
            }
        }
    }
}