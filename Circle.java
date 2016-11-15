/* 
Stephanie Caston
9/18/2013
ITCS 1213
*/

//Creates the circle class 
public class Circle
{

//Declares instance fields and sets PI to 3.14159 
private double radius; 
private double PI = 3.14159; 

//Allows the user to set the radius in the CircleDemo class
public void setRadius(double r)
{
radius = r; 
} 
public double getRadius()
{
return radius; 
} 
//Sets up the formula to get and return Area
public double getArea()
{
double a; 
a = radius*radius*PI;
return a; 
}
//Sets up the formula to get and return Diameter
public double getDiameter() 
{
double d; 
d = radius+radius; 
return d; 
}
//Sets up the forumla to get and return Circumference
public double getCircumference()
{
double c; 
c = 2*PI*radius; 
return c; 
} 
} 



