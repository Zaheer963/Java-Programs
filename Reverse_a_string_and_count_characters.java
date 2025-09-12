import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder(s);
        System.out.println(s1.reverse());
        System.out.print(s1.length());
    }
}