import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        boolean pangram = true;
        for(int i=97; i<=122; i++)
        {
            if(a.indexOf(i) == -1) pangram = false;
        }
        if(pangram) System.out.print("Pangram");
        else System.out.print("Not Pangram");
    }
}