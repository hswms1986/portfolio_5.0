/*
CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 1 Distance
 */

package distance;

import java.util.Scanner;

/**
 *
 * @author Steven
 */
public class Distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        //we use the scanner to input two values for x1 and y1
        System.out.println("Give me two numbers");
        double a;
        double x1 = num.nextDouble();
        double y1 = num.nextDouble();
        
        System.out.println("(" +x1+ "," +y1+ ")");
        
        System.out.println("Give me two more numbers");
        //we use the scanner to input two values for x2 and y2
        double x2 = num.nextDouble();
        double y2 = num.nextDouble();
        
        System.out.println("(" +x2+ "," +y2+ ")");
        
        //we assign the equation for distance
        a = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        double distance = Math.pow(a , 0.5);
        
        //print the equation for distance
        System.out.println("distance =" +distance);
    }
    
}