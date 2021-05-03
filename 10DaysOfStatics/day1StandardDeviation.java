//question link--https://www.hackerrank.com/challenges/s10-standard-deviation/problem?h_r=next-challenge&h_v=zen


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'stdDev' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void stdDev(List<Integer> arr) {
    // Print your answers to 1 decimal place within this function
    int n=arr.size();
    double sum=0;
    for(int i=0;i<n;i++){
            sum=sum+arr.get(i);
    }
    double mean=sum/n;
    double sumNum=0;
    double[] num=new double[n];
    for(int i=0;i<n;i++){
            num[i]=Math.pow(arr.get(i)-mean,2);
            sumNum=sumNum+num[i];
            
    }
    double dev=Math.sqrt(sumNum/n);
    System.out.println(dev);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] valsTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> vals = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valsItem = Integer.parseInt(valsTemp[i]);
            vals.add(valsItem);
        }

        Result.stdDev(vals);

        bufferedReader.close();
    }
}
