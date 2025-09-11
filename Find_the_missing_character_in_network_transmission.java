import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String es = sc.next();
        String ds = sc.next();
        boolean m = false;
        for(int i=0; i<es.length(); i++)
        {
            int idx = ds.indexOf(es.charAt(i));
            if(idx == -1)
            {
                m = true;
                System.out.print(es.charAt(i));
            }
        }
        if(!m) System.out.print("No Missing Character");
    }
}