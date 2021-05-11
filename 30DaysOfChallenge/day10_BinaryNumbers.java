//question link--https://www.hackerrank.com/challenges/30-binary-numbers/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        int count = 0,large=0;
       
        while(n>0){
                int rem=n%2;
                n=n/2;
                if(rem==1){
                        count++;
                        if(count>large){
                        large=count;
                        }
                }
                else{
                        count=0;
                }
         }
       System.out.println(large);
    }
}
