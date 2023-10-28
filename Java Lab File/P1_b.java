/* Write a program to validate email address
 * @ should be before.
 * alphabet or digit should be before and after @
 * alphabet should be before . and 3 alphabets after.
 */

import java.util.Scanner;

class EmailValidator {
    
    public boolean validateEmail(String email) {
        int atIndex = email.indexOf('@');
        int dotIndex = email.lastIndexOf('.');

         // Check if '@' is before '.' and there is at least one character before and after '@'
        if(atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1) {
            // Check if there are exactly three chracters after the last dot
            if(email.length() - dotIndex == 4) {
                return true;
            }
        }
        return false;
    }
}

public class P1_b {
    public static void main(String[] args) {

        EmailValidator x = new EmailValidator();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an email: ");
        String email = sc.nextLine();

        boolean isValid = x.validateEmail(email);
        System.out.println(email+ " is Valid: "+ isValid);
        sc.close();
    }
}
