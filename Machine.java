/*
Stephanie Caston
9/30/2013
ITCS 1212
*/

import java.util.Random; 
import java.util.Scanner; 
import java.text.DecimalFormat;

//Name of the class
public class Machine
{
public static void main(String[]args)
{ 
Scanner keyboard = new Scanner(System.in); 
double money;  
String objectOne; 
String objectTwo;
String objectThree;
String confirmDeny; 
double actualMoney;
boolean again = false;  
double totalMoney;
double count = 0; 
double countTwo = 0;
char character;  
//A do while loop that will start the game over if the 
//player wishes to play another game 
do
{
//Creates an object from the slot class
Slot slotMachine = new Slot();

//Prompts the user to enter how much money they want to play with 
System.out.println("How much money are you going to play with?");
money = keyboard.nextDouble();

//Counts the amount of money entered into slot machine total 
countTwo+=money; 

//Sets the amount of money to the amount the user entered 
slotMachine.setmoneySpent(money);

//Assigns the amount of money entered to the variable actualMoney
actualMoney = slotMachine.setmoneySpent(money); 

//Sets the value of integers to have two decimal places 
DecimalFormat myFormatter = new DecimalFormat("#0.00");

//Reprints the amount of money the user has chosen to play with 
System.out.println("The amount you are playing with is: $"+myFormatter.format(actualMoney)); 
System.out.println(" ");


//Creates the 3 random words from the list, (cherries, oranges, plums
//melons, bars, or bells) that act as the 3 slots of the slot machine 
objectOne = slotMachine.toString();
System.out.print(objectOne); 

objectTwo = slotMachine.toStringTwo();
System.out.print(" " +objectTwo); 

objectThree = slotMachine.toStringThree();
System.out.print(" " +objectThree);

System.out.println(" "); 
System.out.println(" ");

//Determines if the users money is doubled or tripled, or if they won nothing. 
//If all objects match the user's money is tripled
//If two objects match the user's money is doubled
//If no objects match the user's money is reduced to zero
if(objectOne == objectTwo && objectTwo == objectThree)
{
System.out.println("You won triple your money! $"+myFormatter.format(actualMoney*3));
actualMoney=actualMoney*3;  
}
else 
{
if(objectOne != objectTwo && objectTwo != objectThree && objectThree != objectOne)
{
System.out.println("You didn't win anything. $" +myFormatter.format(actualMoney*0));
actualMoney=actualMoney*0; 
}
else
{
if(objectTwo == objectThree)
{
System.out.println("You won double your money! $"+myFormatter.format(actualMoney*2));
actualMoney=actualMoney*2; 
}
else
{
if(objectOne == objectTwo)
{
System.out.println("You won double your money! $"+myFormatter.format(actualMoney*2));
actualMoney=actualMoney*2; 
}
else 
{
if(objectOne != objectTwo && objectOne == objectThree)
{
System.out.println("You won double your money! $"+myFormatter.format(actualMoney*2));
actualMoney=actualMoney*2; 
}
}
}
}
}
//Adds up the total amount of money earned from all the games played
count+=actualMoney;
System.out.println(" "); 
//Prints the total winnings  
System.out.println("This is your total winnings: $" +myFormatter.format(count));
System.out.println(" ");
//Prompts the user to enter if they want to play again
System.out.println("Would you like to play again? (Y/N)");
confirmDeny = keyboard.next();

character = confirmDeny.charAt(0); 

//Checks if the character entered was yes or no

if(character == 'y'|| character == 'Y')
{
again = true; 
}
else
{
if(character == 'n' || character == 'N')
{
again = false;
System.out.println(" ");
System.out.println("Total amount of money entered into slot machine: $" 
                   +myFormatter.format(countTwo));
System.out.println("Total amount of winnings: $" +myFormatter.format(count));
System.out.println("Thank you for playing!");
}
else
{
System.out.println("Not a valid choice. Starting a new game.");
again = true; 
}
}

System.out.println(" "); 

//If the boolean variable "again" is set to true, the program loops 
//and the user is able to play again
}while(again == true);
}
}








