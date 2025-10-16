
import java.util.*;
import java.text.DecimalFormat;

public class Triangle
{
    // Write an Application that reads the length of three sides a triangle.
    // Compute the area of the triangle using Heron's formular.
    
    public static void main(String [] args)
    {
        // declare coordinate variable of 2 points
        float a,b,c;
        float S, Area;
                             
                
        System.out.println("\n Enter the sides of the triangle :");
        
        Scanner scan = new Scanner(System.in);
                 
        System.out.print("\tSide 1 --> :  " );
            a = scan.nextFloat(); 
            
        System.out.print("\tSide 2 --> :  " );
            b = scan.nextFloat();
        
        System.out.print( "\tSide 3 --> :  " );
            c= scan.nextFloat();
        
         if(a<0 || b<0 || c<0 || (a+b<=c) || (a+c<=b) || (b+c<=a))       
        {
            System.out.println(" \n *** Invalid entered value!  ");
            System.exit(0);
        }
        
         S = (a+b+c)/2;           
         Area =(float) Math.sqrt(S*(S-a)*(S-b)*(S-c));         // Using Heron's formular
        
        // Round the output to two decimal place 
        DecimalFormat fmt = new DecimalFormat("0.000");

        System.out.println(" The Area of the triangle are :  " + fmt.format(Area));
    }
}
