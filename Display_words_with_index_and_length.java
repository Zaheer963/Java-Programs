import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String w[] = s.split(" ");
        for(int i=0; i<w.length; i++)
        {
            System.out.println("w["+i+"]: "+w[i]+" : "+w[i].length());
        }
    }
}