//question link--https://www.hackerrank.com/challenges/30-2d-arrays/problem?h_r=next-challenge&h_v=zen



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int sum=0;
        int large=-10000;
        for(int i=0;i<arr.size();i++){
                for(int j=0;j<arr.size();j++){
                        sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                        if(sum>large){
                                large=sum;
                        }
                        
                        if(j+2==arr.size()-1){
                                break;
                        }
                }
                if(i+2==arr.size()-1){
                        break;
                }
        }
        System.out.print(large);
    }
}
