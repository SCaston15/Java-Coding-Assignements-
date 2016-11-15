import java.util.Scanner; 
public class TelevisionDemo
{
public static void main(String[]args) 
{
Scanner keyboard = new Scanner(System.in);  
Television myTelevision = new Television(); 
String manufacturer; 
boolean powerOn; 
double screenSize, channel, volume, increaseVolume, decreaseVolume; 
System.out.println("What is the manufacturer's brand?");
manufacturer=keyboard.nextLine(); 
System.out.println("What is the screen size?");
screenSize=keyboard.nextDouble(); 

powerOn = true;
if(powerOn = true)
{
System.out.println("The TV is on." ); 
}
else
{
System.out.println("The Tv is off" ); 
System.out.println("What channel do you want the tv on?"); 
channel=keyboard.nextDouble(); 

myTelevision.setChannel(channel); 

System.out.println("Increase volume by how much?"); 
volume=keyboard.nextDouble();

increaseVolume=volume; 


System.out.println("The tv is too loud, decrease volume by how much?"); 
volume=keyboard.nextDouble(); 

volume = increaseVolume-volume; 


System.out.println("The manufacturer is: " +manufacturer);  
System.out.println("The screensize is: " +screenSize); 
if(powerOn = true)
{
System.out.println("The TV is on.");
}
System.out.println("The channel is channel: " +channel);
System.out.println("The volume is now: " +volume); 
}
}
}