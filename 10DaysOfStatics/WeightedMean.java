//question link--https://www.hackerrank.com/challenges/s10-weighted-mean/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'weightedMean' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY X
     *  2. INTEGER_ARRAY W
     */

    public static void weightedMean(List<Integer> X, List<Integer> W) {
    // Write your code here
    double sum=0;
    double sumW=0;
    for(int i=0;i<X.size();i++){
            sum=sum+X.get(i)*W.get(i);
            sumW=sumW+W.get(i);
    }
    double Wmean=sum/sumW;
    System.out.printf("%.1f",Wmean);

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

        String[] weightsTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> weights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int weightsItem = Integer.parseInt(weightsTemp[i]);
            weights.add(weightsItem);
        }

        Result.weightedMean(vals, weights);

        bufferedReader.close();
    }
}
