//question link---https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem


//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
         Map<String,Integer> dic = new HashMap<String,Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dic.put(name,phone);
            //System.out.println(dic.get(name));
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dic.containsKey(s)){
            System.out.println(s+"="+dic.get(s));
            }else{
                    System.out.println("Not found");
            }
            
        }
        in.close();
       
    }
}
