import java.util.Scanner; 

public class Airlines
{
public static void main(String[] args)
{

Scanner keyboard = new Scanner(System.in); 

int[] seats = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
int choice; 
int seatsLeft = 10; 
int count = 0; 
int index = 0; 

System.out.println("These are the seats available: ");

for(int i=0; i<seats.length; i++)
{
System.out.print(seats[i]+" ");  
}

System.out.println(" ");


do
{
System.out.println(" ");
System.out.println("There are " + seatsLeft + " seats left. Please choose a seat to reserve: "); 
choice=keyboard.nextInt();

seatsLeft = seatsLeft-1; 

System.out.println("Your seat # is: " + choice);
System.out.println("These are the seats left");

System.out.println(" "); 
count = count + 1; 
for(int i=0; i<seats.length; i++)
{
System.out.print(seats[i]+ " ");
}
}while(count<10);



}
}