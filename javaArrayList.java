//question link--https://www.hackerrank.com/challenges/java-arraylist/problem


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        ArrayList<ArrayList<Integer>> prob = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<T;i++){
               prob.add(new ArrayList<Integer>());
               prob.get(i).add(0,s.nextInt());
               for(int j=1;j<=prob.get(i).get(0);j++){
                       prob.get(i).add(s.nextInt());
               } 
        }
        //System.out.print(prob);
        int N=s.nextInt();
        for(int i=0;i<N;i++){
                int row=s.nextInt();
                int col=s.nextInt();
                try{
                        System.out.println(prob.get(row-1).get(col));
                }catch(Exception e){
                        System.out.println("ERROR!");
                }
        }
    }
}
