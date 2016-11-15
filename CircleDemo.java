/*
Stephanie Caston
9/18/2013
ITCS 1213
*/ 

import java.util.Scanner; 

public class CircleDemo
{
public static void main(String[]args)
{
//Creates an object named myCirc from the Circle class 
Circle myCirc = new Circle();
Scanner keyboard = new Scanner(System.in);  

double theArea; 
double theDiameter; 
double theCircumference; 
double radius; 

//Prompts the user to enter the radius of the cirle 
System.out.println("What is the radius of the circle?");
radius = keyboard.nextDouble(); 

//Inserts the user's input into the radius method for the myCirc object
myCirc.setRadius(radius);

//The methods for area, diameter, and circumference for the myCirc object 
theArea = myCirc.getArea();
theDiameter = myCirc.getDiameter();
theCircumference = myCirc.getCircumference();  

//Prints the results for the area, diameter, and circumference after the 
//radius has been applied to the area, diameter, and circumference methods. 
System.out.println("The circle has a radius of: " +radius);
System.out.println("The circle has an area of: " +theArea); 
System.out.println("The circle has a diameter of: " +theDiameter);
System.out.println("The circle has a circumference of: "+theCircumference); 

}
}
