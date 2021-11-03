//https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/problem?isFullScreen=false


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        try{
                System.out.print(Integer.parseInt(S));
        }catch(Exception e){
                System.out.print("Bad String");
        }

        bufferedReader.close();
    }
}
