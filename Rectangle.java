public class Rectangle
{
private double width, length; 
public void setWidth(double w)
{
width = w; 
}
public void setLength(double ln)
{
length = ln; 
}
public double getWidth()
{
return width; 
}
public double getLength()
{
return length;
}
public double perimeter()
{
double p; 
p = length+length+width+width; 
return p; 
}
public double area()
{
double a;
a = length*width;
return a; 
}
public Rectangle(double len, double wid)
{
length = len; 
width = wid; 
}
public Rectangle()
{
}
}