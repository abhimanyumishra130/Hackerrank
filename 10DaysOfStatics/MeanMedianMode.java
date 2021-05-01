//question link---https://www.hackerrank.com/challenges/s10-basic-statistics/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double[] array=new double[N];
        for(int i=0;i<N;i++){
            array[i]=sc.nextDouble();
        }
        Arrays.sort(array);
        double sum=0;
        for(int i=0;i<N;i++){
            sum=sum+array[i];
        }
        double mean=sum/N;
        int mid=N/2;
        int Mid=(N+1)/2;
        double median;
        if(N%2==0){
         median=(array[mid-1]+array[mid-1+1])/2;    //mid-1   means the indexing start from 0
        }
        else{
             median=(array[Mid-1]);
        }
        double maxValue = 0;
        int maxCount = 0, i, j;

      for (i = 0; i <N; ++i) {
         int count = 0;
         for (j = 0; j < N; ++j) {
            if (array[j] == array[i])
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = array[i];
         }
      }
      System.out.println(mean);
        System.out.println(median);
          System.out.println(maxValue);
 
        
        
        
    }
}
