/**********************************************************
 * A program in Java that does Square
 *
 * @author (Van Nguyen)
 * @version (Sunday January 23th, 2022)
 **********************************************************/
     // import Declaration
import java.util.Scanner;    // class Scanner in package obtaining read input from keyboard

public class Square
{
    public static void main (String[] args)
    { 
         double radius, area;                        // variables declared
         Scanner scan = new Scanner(System.in);;     // declaration a Scanner object 
         
         System.out.print( " Enter the radius : ");  //allow users to enter data
         radius = scan.nextDouble();                 // data is numberic 
         
         area = Math.PI*radius*radius;               // arithmetic expressions
                                                     
         System.out.println(" Area " +area);         // output result
                  
    }
}
