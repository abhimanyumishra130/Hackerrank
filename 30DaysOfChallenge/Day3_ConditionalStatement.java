//question llink--https://www.hackerrank.com/challenges/30-conditional-statements/problem


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println((N%2==1 || (N>=6 && N<=20))?"Weird":"Not Weird");
        

        scanner.close();
    }
}
