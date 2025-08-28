import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%100==0)
        {
            if(n>20000)
            {
                System.out.println("Please enter a lesser denomination");
            }
            else
            {
                if(n<=500)
                {
                    System.out.println(n/100+" hundreds");
                }
                else
                {
                    int h=5,f=0;
                    f=(n-500)/500;
                    h=h+((n-500)%500)/100;
                    if(h>5)
                    {
                        h=h-5;
                        f=f+1;
                    }
                    System.out.println(f+":500s "+h+":100s");
                }
            }
        }
        else
        {
            System.out.println("Please enter the amount in multiples of 100");
        }
    }
}