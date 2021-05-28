
//question link--https://www.hackerrank.com/challenges/valid-username-checker/problem




import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     
     */
    public static final String regularExpression = "^[A-Za-z][\\w[^\\W]]{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
