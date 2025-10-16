/*******************************************************************************
* CS 151 PROGRAM ASSIGMENT # 02
* 
* Distance Calculation
*
* Van Nguyen
*
* Wednesday Febuary 15th 2022.
**********************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance
{
	// Write a program to calculate the distance between two points on the coordinate plane.
	
	public static void main(String [] args)
	{
		double x1, y1, x2, y2;                  // declare coordinate variable of 2 points
		double a, b, c;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print( " Enter the coefficient of x1 :  ");
		x1 = scan.nextDouble();
		
		System.out.print( " Enter the coefficient of y1 :  ");
		y1 = scan.nextDouble();
		
		System.out.print( " Enter the coefficient of x2 :  ");
		x2 = scan.nextDouble();
		
		System.out.print( " Enter the coefficient of y2 :  ");
		y2 = scan.nextDouble();
		
		a = x2 - x1;
		b = y2 - y1;
		c = Math.sqrt(a*a+b*b);         // Using Pythagorean theorem
		
		// Round the output to two decimal place 
		DecimalFormat fmt = new DecimalFormat("0.###");

		System.out.println(" Distance between two points are :  " + fmt.format(c));
	}
}
