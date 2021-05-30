//question link--https://www.hackerrank.com/challenges/java-bigdecimal/problem



import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        String t="";
        // double large=0;
        // double ss=0;
        for(int i=0;i<s.length-2;i++){
                for(int j=1;j<n-i;j++){
                      BigDecimal large = new BigDecimal(s[j]);
                        BigDecimal ss=new BigDecimal(s[j-1]);
                        if(large.compareTo(ss)>0){
                                t=s[j];
                                s[j]=s[j-1];
                                s[j-1]=t;
                        }
                }
                //s[i]=Double.toString(large);
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
