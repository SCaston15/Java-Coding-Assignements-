public class Retail
{ 
private String description; 
private int unitsOnHand; 
private double price; 

public String description(String description)
{
return description; 
}

public void setUnitsOnHand(int units)
{
unitsOnHand = units;  
} 

public int getUnitsOnHand()
{
return unitsOnHand; 
}

public void setPrice(double prices)
{
price = prices;
}

public double getPrice()
{
return price;
}

public double getIncrease()
{
double increase;
increase = (price*.05) + price;  
return increase;  
} 
}
