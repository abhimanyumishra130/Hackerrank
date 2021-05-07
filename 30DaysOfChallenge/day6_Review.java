//question link--https://www.hackerrank.com/challenges/30-review-loop/problem


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
        for(int i=0;i<n;i++){
                String s=sc.next();
                for(int j=0;j<s.length();j++){
                        System.out.print(s.charAt(j));
                        j++;
                }
                System.out.print(" ");
                for(int k=1;k<s.length();k++){
                        System.out.print(s.charAt(k));
                        k++;
                }
                System.out.println();
        }
    }
}
