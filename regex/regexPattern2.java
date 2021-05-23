//question link--https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem?h_r=next-challenge&h_v=zen



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {    

    public static void main(String[] args) {
        
        Tester tester = new Tester();
        tester.check("(.{3}\\.){3}.{3}"); 
    
    }
}

class Tester {

    public void check(String pattern){
    
        Scanner scanner = new Scanner(System.in);
      	String testString = scanner.nextLine();
        Pattern p = Pattern.compile(pattern);
 		Matcher m = p.matcher(testString);
 		boolean match = m.matches();
        
        System.out.format("%s", match);
    }   
    
}
