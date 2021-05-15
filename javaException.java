//question link--https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem?h_r=next-challenge&h_v=zen



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        try{
                int x=sc.nextInt();
                int y=sc.nextInt();
                int c=x/y;
                System.out.println(c);
        }catch(InputMismatchException e){
                System.out.print(e.getClass().getName());
        }
        catch(Exception ex){
                System.out.print(ex);
        }
        
    }
}
