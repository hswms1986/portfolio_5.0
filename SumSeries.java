/*
 CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 11 SumSeries
 */
package sumseries;
import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class SumSeries {
    public static void main(String[]args) {
    int z;
    Scanner scan = new Scanner(System.in);
    System.out.println("Give me a number:");
    
    z = scan.nextInt();
    
    System.out.println("The sum is:" + SumSeries(z));
    }

   static int SumSeries(int num) {
       if(num > 0){
           return num + SumSeries(num - 1);
       }
       else{
           return 0;
       }
       
   }
    
}
