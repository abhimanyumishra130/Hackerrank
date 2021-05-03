//question link---https://www.hackerrank.com/challenges/s10-quartiles/problem


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'quartiles' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> quartiles(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    int n=arr.size();
    int median=0;
    int lowerMedian=0;
    int upperMedian=0;
    if(n%2==1){
            Collections.sort(arr);
            int mid=(n+1)/2;
            median=arr.get(mid-1);
            if(mid%2==0){
            int lowerMid=mid/2;
            int upperMid=mid+(mid/2);
            lowerMedian=arr.get(lowerMid);
            upperMedian=arr.get(upperMid);
            }
            else{
                 int lowerMid=(mid-1)/2;
            int upperMid=mid+((mid-1)/2);   
             lowerMedian=(arr.get(lowerMid)+arr.get(lowerMid-1))/2;
            upperMedian=(arr.get(upperMid)+arr.get(upperMid-1))/2;
            }
            
    }
    else{
            int mid=n/2;
            median=(arr.get(mid-1)+arr.get(mid+1-1))/2;
            if(mid%2==1){
                int lowerMid=(mid-1)/2;
            int upperMid=mid+1+((mid-1)/2);   
            lowerMedian=arr.get(lowerMid);
            upperMedian=arr.get(upperMid-1);  
             //lowerMedian=(arr.get(lowerMid)+arr.get(lowerMid-1))/2;
            //upperMedian=(arr.get(upperMid)+arr.get(upperMid+1))/2;
            }
            else{
                  int lowerMid=mid/2;
            int upperMid=mid+(mid/2);
            lowerMedian=(arr.get(lowerMid)+arr.get(lowerMid-1))/2;
            upperMedian=(arr.get(upperMid)+arr.get(upperMid-1))/2;
            //lowerMedian=arr.get(lowerMid-1);
           // upperMedian=arr.get(upperMid+1);  
            }
            //Collections.sort(arr);
           
           
    }
    return Arrays.asList(lowerMedian,median,upperMedian);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] dataTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int dataItem = Integer.parseInt(dataTemp[i]);
            data.add(dataItem);
        }

        List<Integer> res = Result.quartiles(data);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
