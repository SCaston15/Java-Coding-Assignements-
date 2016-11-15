import java.util.Scanner; 
public class Practice
{
public static void main(String[]args)
{
Scanner keyboard = new Scanner(System.in); 
String question;

System.out.println("Enter your question"); 
question = keyboard.nextLine();
System.out.println(question.length());
}
}
