/******************************************************************
 * CS 151 PROGRAM ASSIGNMENT # 5
 * 
 * 
 * BMI  ( the Body Mass Index )
 * 
 * @author (Van Nguyen)
 * @version (February 28th, 2022)
 ********************************************************************/
 import java.util.Scanner;
 
 public class BMI     
 {
     // Reads the user’s height and weight and prints comments BMI accordingly.
     
    public static void main(String [] args)
    {
        double Weight,Height;
        double BMI;
         
        Scanner scan = new Scanner(System.in);
       
                                 
        System.out.print(" Enter your Height in inches : " );
            Height = scan.nextDouble();
                
        System.out.print(" Enter your Weight in pounds : " );
            Weight = scan.nextDouble();
                
        BMI = (Weight*703.0)/(Height*Height);
                
        if(BMI<18.5)                                           // Condition 1
        {
            System.out.println(" Your BMI is : " + BMI);       // Executed if condition 1 is true
            System.out.println("\" Underweight \"");
        }                  
            else if (BMI>=18.5 && BMI<25)                      //  Condition 2
            {        
                System.out.println(" Your BMI is : " + BMI);
                System.out.println("\" Normal \"");
            }
            
            else if(BMI>=25 && BMI<30)                         // Condition 3
            {       
                System.out.println(" Your BMI is : " + BMI);
                System.out.println("\" Slightly Overweight \"");
            }
            else if(BMI>=30 && BMI<40)                         // Condition 4
            {       
            System.out.println(" Your BMI is : " + BMI);
            System.out.println("\" Overweight \"");
            }
         
        else
        {
            System.out.println(" Your BMI is : " + BMI);      //  Executed if all conditions is False
            System.out.println("\" Obese \"");
        }
    }
 }
