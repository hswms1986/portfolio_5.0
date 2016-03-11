/*
 CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 5 CheckPassword
 */
package checkpassword;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class CheckPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password;
        Scanner pword = new Scanner(System.in);
        System.out.println("What is you password");
        password = pword.nextLine();
        PassCheck(password);
    }
    public static void PassCheck(String password) {
        
        for (int y = 0; y < password.length(); y++){
            if((password.charAt(y) >= 48 && password.charAt(y) <= 57) || (password.charAt(y) >= 65 && password.charAt(y) <= 90) ||
                    (password.charAt(y) >= 97 && password.charAt(y) <= 122)){
               for (int n = 0; n < password.length(); n ++) {
                   int num = 0;
                   if (password.charAt(n) >= 48 && password.charAt(n) > 58) {
                       num ++;
                       if (num <= 2) {
                           if (password.length() >= 8){
                               System.out.println("You have a good password.");
                           } else {
                               System.out.println("This is not good for anyone.");
                           }
                       }
                   }
               } 
               
            }

        }
    
    }
}
   
