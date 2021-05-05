//question link--https://www.hackerrank.com/challenges/s10-binomial-distribution-1/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //System.out.println("0.696");
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        double g=sc.nextDouble();
        
        double p=b/(b+g);
        double q=g/(b+g);
        
        int n=6;
        int x=3;
        
        
        
        double sumation=0;
        for(int j=x;j<=n;j++){
                //System.out.println(x);
                double fac_n=1;
        double fac_x=1;
        double fac_n_x=1;
                for(int i=n;i>=1;--i){
               fac_n=fac_n*i; 
               //System.out.println(fac_n);
        }
        for(int i=j;i>=1;--i){
                fac_x=fac_x*i;
               // System.out.println();
        }
        for(int i=n-j;i>=1;i--){
                fac_n_x=fac_n_x*i;
               //System.out.println(fac_n_x);
        }
        double n_of_x=fac_n/(fac_x*fac_n_x);
        //System.out.println(n_of_x);
                sumation=sumation+(n_of_x*Math.pow(p,j)*Math.pow(q,n-j));
                //System.out.println(sumation);
        }
        
        System.out.printf("%.03f",sumation);
    }
}
