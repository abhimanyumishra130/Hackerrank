//question link---https://www.hackerrank.com/challenges/s10-geometric-distribution-1/problem



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double nemo=sc.nextDouble();
        double deno=sc.nextDouble();
        double p=nemo/deno;
        double q=1-p;
        
        int n=5;
        double geo_dis=Math.pow(q,n-1)*p;
        System.out.printf("%.03f",geo_dis);
    }
}
