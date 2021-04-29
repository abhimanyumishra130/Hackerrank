/*
A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, s , and an integer, k , complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints
1<=|s|<1000
s consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
Explanation 0

String s="welcometojava" has the following lexicographically-ordered substrings of length :
["ava""com""elc""eto""jav""lco""met""oja""ome""toj""wel"]

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

*/


import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String sequence=s.substring(0,k);
        String smallest = sequence;
        String largest = sequence;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0;i<=(s.length()-k);i++){
            sequence=s.substring(i,i+k);
            if(sequence.compareTo(smallest)<0){
                smallest=sequence;
            }
            if(sequence.compareTo(largest)>0){
                largest=sequence;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
