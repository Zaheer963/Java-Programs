import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String w[] = s.split(" ");
        for(int i=0; i<w.length; i++)
        {
            StringBuilder sb = new StringBuilder(w[i]);
            System.out.print(sb.reverse()+" ");
        }
    }
}