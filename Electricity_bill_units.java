import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bill=0;
        if(n<=100)
            bill = n*6;
        else if(n>100 && n<=200)
            bill = 100*6+(n-100)*8;
        else if(n>200 && n<=300)
            bill = 100*6+100*8+(n-200)*10;
        else if(n>300 && n<=400)
            bill = 100*6+100*8+100*10+(n-300)*12;
        else if(n>400)
            bill = 100*6+100*8+100*10+100*12+(n-400)*14;
        System.out.print(bill);

    }
}