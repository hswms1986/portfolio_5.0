/*
 CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 4 InputSum
 */
package inputsum;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class InputSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Give me a number:");
        int numbr = num.nextInt();
        int total = 0;
        String nums = "";
        
        do{
            total += numbr;
            nums += "," + numbr;
           numbr = num.nextInt();
           
           
        }while(numbr != -1);
        
        
        System.out.println("Entered Numbers:" + " " + nums);
        
        System.out.println("The Sum:" + " " + total);
        
    }
        
    }
