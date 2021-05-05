//question link--https://www.hackerrank.com/challenges/s10-binomial-distribution-2/problem?h_r=next-challenge&h_v=zen


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner sc=new Scanner(System.in);
        double rate=sc.nextDouble();
        double n=sc.nextDouble();
        double p=rate/100;
        double q=1-p;
        
        
        
        int x=2;
        double sumation0=0;
        for(double j=0;j<=x;j++){
                double fac_n=1;
        double fac_x=1;
        double fac_n_x=1;
                for(double i=n;i>=1;--i){
               fac_n=fac_n*i; 
               //System.out.println(fac_n);
        }
        for(double i=j;i>=1;--i){
                fac_x=fac_x*i;
               // System.out.println();
        }
        for(double i=n-j;i>=1;i--){
                fac_n_x=fac_n_x*i;
               //System.out.println(fac_n_x);
        }
        double n_of_x=fac_n/(fac_x*fac_n_x);
        //System.out.println(n_of_x);
                sumation0=sumation0+(n_of_x*Math.pow(p,j)*Math.pow(q,n-j));
        }
        
        
        
        double sumation1=0;
        for(double j=x;j<=n;j++){
                //System.out.println(x);
                double fac_n=1;
        double fac_x=1;
        double fac_n_x=1;
                for(double i=n;i>=1;--i){
               fac_n=fac_n*i; 
               //System.out.println(fac_n);
        }
        for(double i=j;i>=1;--i){
                fac_x=fac_x*i;
               // System.out.println();
        }
        for(double i=n-j;i>=1;i--){
                fac_n_x=fac_n_x*i;
               //System.out.println(fac_n_x);
        }
        double n_of_x=fac_n/(fac_x*fac_n_x);
        //System.out.println(n_of_x);
                sumation1=sumation1+(n_of_x*Math.pow(p,j)*Math.pow(q,n-j));
                //System.out.println(sumation);
        }
        System.out.printf("%.03f%n",sumation0);   // For At most 2 rejects
        System.out.printf("%.03f",sumation1);     //For at least 2 rejects
    }
}
