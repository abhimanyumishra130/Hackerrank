//question link---https://www.hackerrank.com/challenges/java-primality-test/problem




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger N=new BigInteger(n);
        Boolean prime=N.isProbablePrime(1);
        if(prime){
                System.out.print("prime");
        }else{
                System.out.print("not prime");
        }
    }
}
