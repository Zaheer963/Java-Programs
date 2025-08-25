import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String s = (year % 4 == 0 && year % 100 != 0)? "Yes" : ((year % 400 == 0)? "Yes" : "No");
        System.out.print(s);
    }
}