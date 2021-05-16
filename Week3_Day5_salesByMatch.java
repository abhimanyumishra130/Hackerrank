//question link--https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int[] f=new int[n];
    int visit=-1;
    for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                    if(ar.get(i)==ar.get(j)){
                    count++;
                    f[j]=visit;
                    
                    }
            }
            if(f[i]!=visit){
                    f[i]=count;
            }
    }
    int sum=0;
    for(int k=0;k<f.length;k++){
            if(f[k]!=visit){
            int c=f[k]/2;
            System.out.println(f[k]);
            sum=sum+c;
            }
            
    }
    return sum;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
