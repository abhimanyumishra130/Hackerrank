//question link--https://www.hackerrank.com/challenges/java-negative-subarray/problem



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){     
                int sum=0;
                for(int k=i;k<n;k++){                               
                        sum=sum+a[k];
                        if(sum<0){     
                        count++;
                        }           
                }
        }
        System.out.print(count);
    }
}
