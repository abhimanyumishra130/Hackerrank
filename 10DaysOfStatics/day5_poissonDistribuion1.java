//question link--https://www.hackerrank.com/challenges/s10-poisson-distribution-1/problem




import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        double l=sc.nextDouble();
        double k=sc.nextDouble();
        double e=2.71828;
        double factK=1;
        for(double i=k;i>=1;i--){
                factK*=i;
        }
        
        double poi_dis=(Math.pow(l,k)*Math.pow(e,-l))/factK;
        System.out.printf("%.03f",poi_dis);
    }
}
