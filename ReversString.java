/*
CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 11 ReversString
 */
package reversstring;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class ReversString {

    public static void main(String[]args) {
        String word;
        Scanner say = new Scanner(System.in);
        System.out.println("Give me a word.");
        word = say.nextLine();
        System.out.println("The word backwords is: " + reverse(word));
    }
    
        public static String reverse(String x){
            if((x == null) || (x.length() == 1) ){
            return x;
            }
            else {
            return reverse(x.substring(1)) + x.charAt(0);
            }
        }

    
}
