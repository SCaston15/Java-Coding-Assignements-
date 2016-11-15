/*
Stephanie Caston
10/20/2013
ITCS 1212
*/
import java.util.Scanner;
import java.io.*;

//Declaration of class name
public class Morse
{
public static void main(String[]args)throws IOException
{

   //Declaration of all arrays and instance fields
   String line, name, file = "Code.txt"; 

   String[] numLetters;
   numLetters = new String[36];
   
   String[] morseCode; 
   morseCode = new String[36];  
 
   //Intitalizes i to Zero; 
   int i = 0; 
   
   int index = 0; 
   //Creates an array with the number and letter characters that will be parallel to the morse 
   //Characters. I was forced to do this because I could not get my array loaded from the text
   //file to work properly  
   char[] characters; 
   characters = new char[36];  
   
   //Creates the scanner class 
   Scanner keyboard = new Scanner(System.in);  
   
   String userInput;
   String input;
   
   //Asks the user to enter their sentence to traslate. 
   System.out.println("Enter something to translate: ");
   userInput= keyboard.nextLine();
   
   //Converts the user's input to uppercase to match the characters loaded into the array 
   input = userInput.toUpperCase(); 
   
   //Creates the translate object
   Translate inputTranslate = new Translate(input);
   
   File openFile = new File (file); 
   Scanner inFile = new Scanner (openFile);
   
   while(inFile.hasNext())
   {
   
      //loads the numbers/letters into an array and the morse code characters in an array
      numLetters[i] = inFile.next(); 
      
      morseCode[i] = inFile.next();
      
      i=i+1;
      
   }
   //closes file
   inFile.close();
   
   //Outputs what the user has entered and tells them what the morse translation is. 
   System.out.println("You entered: " + input); 
   System.out.println("The Morse code translation is: "); 
   
   //sets the morse characters
   inputTranslate.setMorseCode(morseCode);
   
   //sets the numbers/letters
   inputTranslate.setCharacters(characters); 
   
   //sets the user input
   inputTranslate.setInput(input);
   
   //outputs the Morse Code 
   System.out.println(inputTranslate.getTranslate());

}
} 