import java.util.Scanner; 
public class Pet
{
public static void main(String[]args)
{
String petName; 
Scanner keyboard = new Scanner(System.in); 

System.out.println("What is the name of your favorite pet?"); 
petName = keyboard.nextLine(); 

System.out.println("The number of characters entered is: " + petName.length()); 
System.out.println(petName.toUpperCase()); 
System.out.println(petName.toLowerCase()); 
System.out.println("The first character of your favorite pet's name is: " + petName.charAt(0)); 
}
}
