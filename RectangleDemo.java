public class RectangleDemo
{
public static void main(String[] args)
{
Rectangle myRect = new Rectangle ();
double theArea;
double thePerimeter; 
myRect.setLength(20);
myRect.setWidth(15); 
theArea = myRect.area(); 
thePerimeter = myRect.perimeter(); 

System.out.println("My rectangle has area: " +theArea);
System.out.println("My rectangle has a perimeter of: " +thePerimeter);

Rectangle myRectangle = new Rectangle (10, 20); 
theArea = myRectangle.area(); 
System.out.println("My rectangle 2 has an area of: " +theArea);
thePerimeter = myRectangle.perimeter();
System.out.println("My rectange 2 has a perimeter of: " +thePerimeter); 
} 
}