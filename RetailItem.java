public class RetailItem
{
public static void main(String[]args)
{

Retail retailOne = new Retail();
Retail retailTwo = new Retail();
Retail retailThree = new Retail();  

int onHand;
double increase;  


retailOne.setUnitsOnHand(12); 
retailOne.description("Jacket");
retailOne.setPrice(60); 
retailOne.getIncrease();
increase = retailOne.getIncrease(); 


System.out.println("Description: " +retailOne.description("Jacket")); 
System.out.println("Number on hand: " +retailOne.getUnitsOnHand()); 
System.out.println("Price: $" +retailOne.getPrice()); 
System.out.println("Price after 5% tax: $" + increase);

retailTwo.setUnitsOnHand(40); 
retailTwo.description("Designer Jeans");
retailTwo.setPrice(100); 
retailTwo.getIncrease();
increase = retailTwo.getIncrease(); 

System.out.println(" "); 

System.out.println("Description: " +retailOne.description("Designer Jeans")); 
System.out.println("Number on hand: " +retailOne.getUnitsOnHand()); 
System.out.println("Price: $" +retailOne.getPrice()); 
System.out.println("Price after 5% tax: $" + increase);

retailThree.setUnitsOnHand(20); 
retailThree.description("Shirt");
retailThree.setPrice(25); 
retailThree.getIncrease();
increase = retailThree.getIncrease(); 

System.out.println(" "); 

System.out.println("Description: " +retailThree.description("Shirt")); 
System.out.println("Number on hand: " +retailThree.getUnitsOnHand()); 
System.out.println("Price: $" +retailThree.getPrice()); 
System.out.println("Price after 5% tax: $" + increase);
}
}