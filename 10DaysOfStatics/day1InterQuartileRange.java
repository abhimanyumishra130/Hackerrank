//question link--https://www.hackerrank.com/challenges/s10-interquartile-range/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'interQuartile' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY values
     *  2. INTEGER_ARRAY freqs
     */

    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
    // Print your answer to 1 decimal place within this function
    int n=values.size();
    ArrayList<Integer> arr =new ArrayList<Integer>();
    for(int i=0;i<n;i++){
            for(int j=0;j<freqs.get(i);j++){
                    arr.add(values.get(i));
                    
            }
    }
    Collections.sort(arr);
    int arrN=arr.size();
    
    double upperMedian;
    double lowerMedian;
    if(arrN%2==1){
            int mid=(arrN)/2;
            if(mid%2==0){
            int lMid=mid/2;
            
            lowerMedian=(arr.get(lMid)+arr.get(lMid-1))/2;
            upperMedian=arr.get(lMid*3);
            }
            else{
                 int lMid=mid/2;
            
             lowerMedian=arr.get(lMid);
            upperMedian=arr.get(mid+lMid+1);
            }
    }
    else{
            int mid=arrN/2;
    if(mid%2==1){
                int lMid=mid/2;
            
            lowerMedian=arr.get(lMid);
            upperMedian=arr.get(mid+lMid);  
            
            }
            else{
                  int lMid=mid/2;
            lowerMedian=(arr.get(lMid)+arr.get(lMid-1))/2;
            upperMedian=(arr.get(mid+lMid)+arr.get(mid+lMid-1))/2;
            
          
            }
    }
            double Q=upperMedian-lowerMedian;
    System.out.println(Q);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] valTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> val = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int valItem = Integer.parseInt(valTemp[i]);
            val.add(valItem);
        }

        String[] freqTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> freq = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int freqItem = Integer.parseInt(freqTemp[i]);
            freq.add(freqItem);
        }

        Result.interQuartile(val, freq);

        bufferedReader.close();
    }
}
