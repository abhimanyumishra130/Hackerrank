//question link--https://www.hackerrank.com/challenges/java-biginteger/problem
  



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        BigInteger b= sc.nextBigInteger();
        BigInteger sum=a.add(b);
        BigInteger multiply=a.multiply(b);
        System.out.println(sum);
        System.out.println(multiply);
    }
}
