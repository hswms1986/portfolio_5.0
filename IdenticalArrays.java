/*
  CS 5000/01
Fall 2015
Henry Williams  
Dr. Haddad
Assignment 7 IdenticalArrays
 */
package identicalarrays;
import java.util.Scanner;
/**
 *
 * @author Steven
 */
public class IdenticalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] square;
        square = new int[3][3];
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square[i].length; j++){
                System.out.println("What number do you want in the matrix?");
                square[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square[i].length; j++){
                System.out.print(square[i][j] + " ");
              }
            System.out.println();
        }
        Scanner s = new Scanner(System.in);
        int[][] rect;
        rect = new int[3][3];
        for(int x = 0; x < square.length; x++){
            for(int y = 0; y < square[x].length; y++){
                System.out.println("What number do you want in the matrix?");
                rect[x][y] = scan.nextInt();
            }
        }
        for(int x = 0; x < square.length; x++){
            for(int y = 0; y < square[x].length; y++){
                System.out.print(square[x][y] + " ");
              }
            System.out.println();
        }
        equals(square, rect);
    }
    
    public static boolean equals(int[][] m1, int[][] m2){
    
        for(int k = 0; k < m1.length;k++){
            for(int l = 0; l < m1[k].length; l++){
        for(int a = 0; a < m2.length; a++){
            for(int z = 0; z < m2[a].length; z++){
                if(m1[k][l] == m2[a][z]){
                    System.out.println("The two arrays are strictly identical!");
                    return true;
                }else{
                    System.out.println("The two arrays are not strictly identical!");
                    return false;
                }
            }
        }
            }
        }
        return false;
            
            
    
    }
    
}
    

