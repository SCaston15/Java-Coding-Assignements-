/*
Stephanie Caston
10/20/2013
ITCS 1212
*/

//Imports the scanner, decimal format, and file class
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.*;

//Declaration of class name
public class Analysis 
{
public static void main(String[]args)throws IOException
{

//Declaration of all arrays and instance fields
   String line, name, file = "Monthly.txt"; 
   
   String[] names;
   names = new String[39];
   
   String[] lastNames;
   lastNames = new String[39];
   
   double[] salaries; 
   salaries = new double[39];
   
   double[] aboveAverage;
   aboveAverage = new double[39];
   
   double[] belowAverage; 
   belowAverage = new double[39];  
   
   double total = 0; 
   double average = 0;  
   
   int i = 0;
   double largest = 0;  
   double lowest = 0;
    
   int highestIndex = 0; 
   int lowestIndex = 0; 
   
   int averageIndex = 0; 
   int averageIndexTwo = 0; 
   
   //Correctly formats numbers generated as sales numbers. 
   DecimalFormat myFormatter = new DecimalFormat("#0,000.00");
   
   //Opens text file that is going to be accessed 
   File openFile = new File (file); 
   //Scans the file that is going to be accessed
   Scanner inFile = new Scanner (openFile); 
   
   //creates the loop that will load the text file into the 3 separate arrays
   //names, lastNames, and salaries
   while(inFile.hasNext())
   {

     
      //The three arrays are loaded from the file
      names[i] = inFile.next(); 
      
      lastNames[i] = inFile.next();
      
      salaries[i] = inFile.nextDouble(); 
   
      //Totals the amount of money made in the array salaries  
      total += salaries[i];
       
      largest = salaries[0]; 
      lowest = salaries[0];
      
      //Runs through the salaries array and finds the largest value
      //Assigns x to lowestIndex to be used with arrays, names, and lastNames
      for(int x=0; x<i; x++)
      {
         if(salaries[x]>largest)
         {
         largest = salaries[x];  
         highestIndex = x; 
         }
      }  
      
      //Runs through the salaries array and finds the smallest value
      //Assigns x to lowestIndex to be used with arrays, names, and lastNames
      for(int x=0; x<i; x++)
      {
         if(salaries[x]<lowest)
         {
         lowest = salaries[x];
         lowestIndex = x; 
         }
      }
      
      //makes it so that i can be each item in all 3 arrays
      i=i+1;
      
      //Calculates the average sales and assigns it to average
      average = total/i;
      }

      //Output for the total sales, average sales, largest sales by salesman's name
      //and lowest sales by salesman's name. 
      System.out.println("The total sales amount for the month was: $" 
      + myFormatter.format(total));  
      
      System.out.println("The average sales amount per salesman for the month was: $"
      + myFormatter.format(average));
      
      System.out.println("The largest sales amount for the month was: $"
      + myFormatter.format(largest) + " by " + names[highestIndex] + " " + lastNames[highestIndex]);  
      
      System.out.println("The lowest sales amount for the month was: $"
      + myFormatter.format(lowest) + " by "+ names[lowestIndex] + " " + lastNames[lowestIndex]); 
      
      //Formatting
      System.out.println(" "); 
      
      //Outputs the below average sales
      System.out.println("The below average sales were: "); 
      System.out.println(" "); 
      
      //Loop that creates an array for below average sales along with the 
      //salesman's names
         for(int j=0; j<i; j++)
         {
            if(salaries[j] < average)
            {
            belowAverage[i]= salaries[j];
            System.out.println("$" +myFormatter.format(belowAverage[i])
            + " from " + names[j] + " " + lastNames[j]); 
            }
         }
         
      System.out.println(" "); 
      
      //Output for above average sales      
      System.out.println("The above average sales were: "); 
      System.out.println(" "); 
      
      //Loop that creates an array for above average sales along with the 
      //salesman's names
         for(int j=0; j<i; j++)
         {
            if(salaries[j] > average)
            {
            aboveAverage[i]= salaries[j];
            System.out.println("$" + myFormatter.format(+aboveAverage[i])
            + " from " + names[j] + " " + lastNames[j]); 
            }
         }      
}
}

     
   