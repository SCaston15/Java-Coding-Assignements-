public class Television
{
String manufacturer; 
private double channel, volume, screenSize; 
boolean powerOn; 

public void Televison(String manufacturer, double size) 
{
powerOn = false; 
volume = 20; 
channel = 2; 
}

public double getVolume()
{
return volume; 
}
public double getChannel()
{
return channel;
}
public String getManufacturer()
{
return manufacturer; 
}
public double getScreenSize()
{
return screenSize; 
}
public void setChannel(double c) 
{
channel = c;  
} 
public boolean Power()
{
powerOn =!powerOn;
return powerOn;
} 
public double decreaseVolume()
{
volume -= 1; 
return volume; 
}
public double increaseVolume()
{
volume +=1; 
return volume; 
} 
}