//question link--https://www.hackerrank.com/challenges/phone-book/problem?h_r=next-challenge&h_v=zen


//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
                HashMap<String,Integer> hash = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
                        hash.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
                        if(hash.containsKey(s)){
                                System.out.println(s+"="+hash.get(s));
                        }else{
                                System.out.println("Not found");
                        }
		}
	}
}



