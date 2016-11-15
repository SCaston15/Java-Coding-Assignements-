/* 
Stephanie Caston
11/14/2013
ITCS 1213
Program 6 
*/

//Imports the scanner class
import java.util.Scanner; 

//Names the class Tournament
public class Tournament
{
public static void main(String[] args)
{ 
   //Creates the scanner object 
   Scanner keyboard = new Scanner(System.in); 
   
   //Declaration of all instance fields 
   int numOfTeams; 
   String team;
   int wins;   
   int count = 0; 
   int bottom = 0;    
   
   //Promps the user to enter how many teams will be playing 
   System.out.println("How many teams are playing in the tournament? ");
   System.out.println("Please enter 2, 4, 8, 16, 32, or 64.");
   numOfTeams = keyboard.nextInt(); 
  
  //Makes it so that the user has to enter 2, 4, 8, 16, 32, or 64 as the number of teams   
  while (numOfTeams !=2 && numOfTeams!=4 && numOfTeams !=8 && numOfTeams !=16 && numOfTeams !=32 && numOfTeams !=64)
  {
      System.out.println("You have entered an invalid number of teams. Please try again."); 
      System.out.println("What is the number of teams in the tournament?");
	   numOfTeams = keyboard.nextInt();
  }            
        // Declares array to store objects
        Teams[] tournament = new Teams[numOfTeams];
        
        do
        {
	       // input team name and number of wins	
          System.out.println("Enter a team name: "); 
          team = keyboard.next(); 
      
          System.out.println("How many wins did that team have? ");
          wins = keyboard.nextInt();
          
          //creates array for team names and their wins
          tournament[count]= new Teams(team, wins);
	       count++;
       	 
          // end do
          }while (count < numOfTeams);
       
       //Loads and displays the tournament arrays, getTeamName, and getWins  
       for(int i=0; i<tournament.length; i++)
       {
         System.out.println("Team: " + tournament[i].getTeamName() + " with "
         + tournament[i].getWins()+ " wins");
       }
        
         System.out.println(" "); 
         System.out.println("Tournament match ups:" );
         System.out.println(" "); 
        
         //Another instance field initialized to manipulate the getTeamName array
         int top = numOfTeams-1;
         
         //Creates the match ups by counting through the getTeamName array and
         //matching them against each other. 
         for(int j=0; j<numOfTeams/2; j++) 
         {
         
         //intitalizes do-while loop
         do
         { 
         
         //displays the match ups 
         System.out.println("Game: "+ (j+1) + " " +tournament[bottom].getTeamName() +
          " Vs. " + tournament[top].getTeamName()); 
         
         //counts through array from 0 to half of the teams 
         bottom = bottom+1;
         
         //counts through the array from half of the teams to full amount of teams 
         top = top-1; 
         
         //ends do-while 
         }while(bottom < 1); 
         }
                 
}
}

//Creates class Teams
class Teams
{ 
   private String teamName;
   private int wins;

   // Constructor to initialize instance fields
   public Teams(String teamName, int wins)
   {
      this.teamName = teamName;
      this.wins = wins; 
   }
   
   //Returns the team names
   public String getTeamName()
   {
      return teamName; 
   }
   
   //Returns the number of wins from each team
   public int getWins()
   {
      return wins; 
   }
} 




