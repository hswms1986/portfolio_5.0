/*
  CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 3 RandomNumbers
 */
package randomnumbers;
import java.text.NumberFormat;
import java.util.Random;
/**
 *
 * @author Steven
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //random number objects are created in order to generate random numbers
        Random num1 = new Random();
        int randNum = num1.nextInt(50) + 25;
        
        Random num2 = new Random();
        int randNum2= num2.nextInt(30) - 20;
        
        Random num3 = new Random();
        int randNum3 = num3.nextInt(30) - 60;
        
        //random numbers for floats are generated a little differently
        //the maximum limit is multiplied 
        Random num4 = new Random();
        double randNum4 = num4.nextDouble() * 17.9999;
        
        //an object is created from the number format class to format the decimal places
        NumberFormat form = NumberFormat.getInstance();
        form.setMinimumFractionDigits(4);
        form.setMaximumFractionDigits(4);
        
        System.out.println(randNum);
        System.out.println(randNum2);
        System.out.println(randNum3);
        System.out.println(form.format(randNum4));
    }
    
}
