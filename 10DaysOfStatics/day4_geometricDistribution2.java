//question link--https://www.hackerrank.com/challenges/s10-geometric-distribution-2/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        private static double fact(double n){
                double fact=1;
                for(double i=n;i>=1;i--){
                        fact=fact*i;
                }
                return fact;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double nemo=sc.nextDouble();
        double deno=sc.nextDouble();
        double p=nemo/deno;
        double q=1-p;
        
        int n=5;
        double fact=0;
        for(int i=1;i<=n;i++){
                fact+=Math.pow(1 - p, i - 1) * p;
        }
        //double geo_dis=Math.pow(q,n-1)*p;
        System.out.printf("%.03f",fact);
    }
}
