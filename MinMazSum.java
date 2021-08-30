/*
link of question--https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

*/



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

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long min_sum=0;
    long max_sum=0;
    for(int i=0;i<5;i++){
       /* for(int j=0;j<arr.size();j++){
            if(j==i)
            continue;
            sum=sum+arr.get(j);
        }
        System.out.print(sum+" ");
        sum=0;  
        
        
    }*/
    min_sum=min_sum+arr.get(i);
    max_sum=max_sum+arr.get(i);
    }
    max_sum=max_sum-arr.get(0);
    min_sum=min_sum-arr.get(arr.size()-1);
    System.out.println(min_sum+" "+max_sum);
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
