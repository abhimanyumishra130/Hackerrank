//question link--https://www.hackerrank.com/challenges/2d-array/problem




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
    // Write your code here
    int sum=0;
    int large=-10000;
    
   // int[][] a=new int[arr.size()-2][arr.size()-2];
    for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                   // int sum=0;
                   
                    //System.out.print(arr.get(i).get(j));
                     sum=arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
                  // a[i][j]=sum;
                   if(sum>large){
                           
                           large=sum;
                   }
                    //System.out.print(sum+" ");
                     if( j+2==arr.size()-1){
                             break;
                     }
                    
                    
            }
            if( i+2==arr.size()-1){
                             break;
                     }
           // System.out.println();
    }
//     int large=a[0][0];
//     for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length;j++){
//                     if(a[i][j]>large){
//                             large=a[i][j];
//                     }
                    
//             }
//     }
    return large;

    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

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

        int result = Result.hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
