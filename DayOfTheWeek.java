/*
 CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 2 DayOfTheWeek
 */
package dayoftheweek;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class DayOfTheWeek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The scanner is used to allow the user to enter the century, year,
        //month and day
        Scanner y = new Scanner(System.in);
        System.out.println("What year is it?");
        int k = y.nextInt() % 100;
        
        Scanner month = new Scanner(System.in);
        System.out.println("What month is it?");
        int m = month.nextInt();
        
        Scanner d = new Scanner(System.in);
        System.out.println("What day of the month is it?");
        int q = d.nextInt();
        
        int j = k/100;
        
        //Variables are created for the day of the week and the name of the day
        int h;
        String day;
        
        //we use Zeller's congruence equation to get the day from the information
        //entered by the user
        h = (q + (26 * (m + 1))/10 + k + (k/4) + (j/4) + (5 * j)) % 7;
        
        //we then use a switch statement to assign a name to the day
        switch(h) {
            case 1: day = "Sunday";
                break;
            case 2: day = "Monday";
                break;
            case 3: day = "Tuesday";
                break;
            case 4: day = "wednesday";
                break;
            case 5: day = "Thursday";
                break;
            case 6: day = "Friday";
                break;
            case 7:day = "Saturday";
                break;
            default: day = "Error";
                break;
        }
        System.out.println("Enter year:" + " " + k);
        System.out.println("Enter month" + " " + m);
        System.out.println("Enter day of the month:" + " " + q);
        System.out.println("Day of the week is" + " " + day);
        
        
        
        
        
        
        
        
        
    }
    
}
