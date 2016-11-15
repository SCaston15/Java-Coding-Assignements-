
public class Raise
{
   // instance fields
   private String name;
   private double salary;

   // constructor
   public Raise(String eName, double eSalary)
   {
     name = eName;
     salary = eSalary;
   } 
   // instance methods
   public void setName (String eName)
   {
     name = eName;
   }
   public void setSalary (double eSalary)
   {
     salary = eSalary;
   }
   public String getName()
   {
     return name;
   }
   public double getSalary()
   {
     return salary;
   }
   // methos to calculate the new salary
   public double calcRaise()
   {
     double newSalary;
     newSalary = salary + salary * 0.10;
     return newSalary;
   }
}