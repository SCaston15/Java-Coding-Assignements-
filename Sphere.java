import javax.swing.JOptionPane;
public class Sphere
{ 
public static void main(String []args)
{ 
String strDiameter;
double radius; 
double numDiameter;  
double volume; 

strDiameter = JOptionPane.showInputDialog("What is the diameter of the sphere?");
numDiameter = Double.parseDouble(strDiameter);

radius = .5*numDiameter; 
volume = 4*(Math.PI*Math.pow(radius, 3))/3; 

JOptionPane.showMessageDialog(null, "The volume of the sphere is " +volume); 
 
}
}