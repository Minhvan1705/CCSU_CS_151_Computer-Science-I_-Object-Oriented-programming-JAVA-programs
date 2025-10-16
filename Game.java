/**********************************************************
 * A program in Java that project Random Game.
 *
 * @author (Van Nguyen)
 * @version (Sunday January 23th, 2022)
 **********************************************************/
 
import java.util.Random;  /* declared Random class in package 
                           a pseudorandom number generator */
public class Game
{
    public static void main (String[] args)   // the main method
    { 
         
        Random rand = new Random();
        int throwA, throwB;            // Integer variable declaration
         
        throwA = rand.nextInt(6)+1;      
        throwB = rand.nextInt(6)+1;        

        
        System.out.println( " Your threw : "+throwA+ " " +throwB );  // output
        
        if(throwA == throwB) // notice the two = in a row
        {
           System.out.println(" Double !! You win !! ");   // true value
           
        }
        else
        {
            System.out.println(" You lose. ");            // false value
        }
    }
}