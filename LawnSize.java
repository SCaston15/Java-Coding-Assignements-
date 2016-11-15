/**
 * This program demonstrates the Rectangle
 * class's getPerimeter method, which uses
 * a local variable.
 */

import java.util.Scanner;
public class LawnSize
{
     public static void main(String [] args)
     {
          Rectangle lawn;
			 double length, width;
			 Scanner kBoard;
          
		 kBoard = new Scanner(System.in);
	   	  lawn = new Rectangle();
			
          // Get the lawn's length.
          System.out.print("What is the length of your "
                           + "lawn, in feet? ");
          length = kBoard.nextDouble();
          lawn.setLength(length);

          // Get the lawn's width.
          System.out.print("What is the width of your "
                           + "lawn, in feet? ");
          width = kBoard.nextDouble();
          lawn.setWidth(width);

          // Display the length around the lawn.
          System.out.println("It is " + lawn.getPerimeter()
                             + " feet around your lawn.");
     }
}

