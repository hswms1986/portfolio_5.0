/*
  CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 3 VowelConsonant
 */
package vowelconsonant;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Steven
 */
public class VowelConsonant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //a scanner object is created in order to ask the user for a letter
        Scanner letter = new Scanner(System.in);
        System.out.println("Give me a letter:");
        String character = letter.nextLine();
        System.out.println("The Character you entered is:\t" + character);
        
        //a switch statement is used to destinguish if the input was a vowel or not
        switch(character) {
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println(character + " " + "is a vowel.");
                break;
            default:
                System.out.println(character + " " + "is a consonant.");
                break;
                
        }
            
        
        
    }
    
}
