/* 
Stephanie Caston 
9/30/2013
ITCS 1212
*/

//Imports the random number class 
import java.util.Random; 

//Declares the name of the class 
public class Slot
{

//Creates a random object 
private Random slotNumber = new Random(); 

//All the declared variables 
private double moneySpent;
String objectName; 
String objectNameTwo;
String objectNameThree;  
                                                                                                                                                                                     
//Creates 3 random numbers from the range 0-5 
int slot1 = slotNumber.nextInt(6); 
int slot2 = slotNumber.nextInt(6); 
int slot3 = slotNumber.nextInt(6);

//Assigns string values to each number that is  
//generated from 0-5 for the first slot 
public String toString()
{
if(slot1 == 0)
{
objectName = "Cherries"; 
}
else
{
if(slot1 == 1) 
{
objectName = "Oranges";
}
else 
{
if(slot1 == 2)
{
objectName = "Plums";
}
else
{
if(slot1 == 3)
{
objectName = "Bells"; 
}
else
{
if(slot1 == 4)
{
objectName = "Melons"; 
}
else
{
if(slot1 == 5)
{
objectName = "Bars";
}
}
}
}
}
}
return objectName; 
}

//Assigns string values to each number that is  
//generated from 0-5 for the second slot 
public String toStringTwo()
{
if(slot2 == 0)
{
objectNameTwo = "Cherries"; 
}
else
{
if(slot2 == 1) 
{
objectNameTwo = "Oranges";
}
else 
{
if(slot2 == 2)
{
objectNameTwo = "Plums";
}
else
{
if(slot2 == 3)
{
objectNameTwo = "Bells"; 
}
else
{
if(slot2 == 4)
{
objectNameTwo = "Melons"; 
}
else
{
if(slot2 == 5)
{
objectNameTwo = "Bars";
}
}
}
}
}
}
return objectNameTwo; 
}

//Assigns string values to each number that is  
//generated from 0-5 for the third slot 
public String toStringThree()
{
if(slot3 == 0)
{
objectNameThree = "Cherries"; 
}
else
{
if(slot3 == 1) 
{
objectNameThree = "Oranges";
}
else 
{
if(slot3 == 2)
{
objectNameThree = "Plums";
}
else
{
if(slot3 == 3)
{
objectNameThree = "Bells"; 
}
else
{
if(slot3 == 4)
{
objectNameThree = "Melons"; 
}
else
{
if(slot3 == 5)
{
objectNameThree = "Bars";
}
}
}
}
}
}
return objectNameThree; 
}

//A setter method for the amount of money that will be entered by the user
public double setmoneySpent(double cash)
{
moneySpent = cash; 
return cash; 
}
}