import javax.swing.JOptionPane; 
public class WordGame
{ 
public static void main(String[] args)
{
String name;
String age; 
String city; 
String college; 
String profession; 
String animal; 
String petName; 

name = JOptionPane.showInputDialog("What is your name? ");
age = JOptionPane.showInputDialog("What is your age? ");
city = JOptionPane.showInputDialog("What city do you live in? "); 
college = JOptionPane.showInputDialog("What college did you go to? ");
profession = JOptionPane.showInputDialog("What is your profession? "); 
animal = JOptionPane.showInputDialog("What type of animal do you have? ");
petName = JOptionPane.showInputDialog("What are your pet/pets names? "); 

JOptionPane.showMessageDialog(null, "There once was a person named, " +name+ " who lived in " +city+ 
" At the age of "+age+ " " +name+ " graduated and went to work as a " +profession+ " Then adopted a" +animal+ 
" named " +petName+ " They both lived happily ever after."); 
                       
}
<polyline points="10 35, 48 1, 90 35" 
      style="stroke:black; fill: gray; opacity:.8"/>