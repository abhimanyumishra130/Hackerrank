//question link--https://www.hackerrank.com/challenges/java-list/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<length; i++){
                arr.add(sc.nextInt());
        }
        int testcases= sc.nextInt();
        for(int i=0; i<testcases; i++){
                String str=sc.next();
                if(str.equals("Insert")){
                        int index =sc.nextInt();
                        int num = sc.nextInt();
                        arr.add(num);
                        for(int j=arr.size()-1; j>index; j--){
                                int temp = arr.get(j);
                                arr.set(j,arr.get(j-1));
                                arr.set(j-1,temp);
                        }
                }
                if(str.equals("Delete")){
                        int indexx=sc.nextInt();
                        arr.remove(indexx);
                }
        }
        for(int i=0;i<arr.size(); i++){
        System.out.print(arr.get(i)+" ");
        }
    }
}
