//question link--https://www.hackerrank.com/challenges/s10-poisson-distribution-1/tutorial



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        private static double pos(double l){
                double Ex2=l+(l*l);
                return Ex2;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double l1=sc.nextDouble();
        double l2=sc.nextDouble();
        double CostA=160+40*pos(l1);
        double CostB=128+40*pos(l2);
        System.out.printf("%.03f%n",CostA);
        System.out.printf("%.03f",CostB);
        
        
        
    }
}
