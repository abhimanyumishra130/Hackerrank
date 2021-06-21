// question link--https://www.hackerrank.com/challenges/java-1d-array/problem


import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        /*int i = 0;
        boolean b =false;
        while(i<game.length){
        if(i+leap>game.length-1){
                b=true;
                break;
        }else{
                
                if(game[i+1]!=0){
                        if(game[i+leap]!=0){
                                if(i-1>0 && game[i-1]==0){
                                        i=i-1;
                                }else{
                                        b=false;
                                        break;
                                }
                        }else i=i+leap;
                        
                }else i=i+1;
        }
        }
        return b;
        */
        return isWork(leap , game , 0);
    }
    public static boolean isWork(int leap, int[] game, int i){
            if(i>=game.length){
                return true;
        }else if(i<0 || game[i]==1){
                return false;
        }
        
        game[i]=1;
        return (isWork(leap , game , i+leap) || isWork(leap , game , i+1) || isWork(leap , game , i-1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
