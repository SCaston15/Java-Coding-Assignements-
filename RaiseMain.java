import java.util.Scanner;
public class RaiseMain
{
  public static void main (String[] args)
  {
    // declare variables  
    String mName;
    double mSalary;  
    Scanner inLine;
    Raise newSalary;

    // input name and salary from user
    inLine = new Scanner(System.in);
    System.out.println ("Enter name");
    mName = inLine.nextLine();
    System.out.println ("Enter salary");
    mSalary = inLine.nextDouble();

    // create object named newSalary from Raise class
    newSalary = new Raise(mName, mSalary);
    // Display new salary
    System.out.println("Raised Salary is " + newSalary.calcRaise());
  }
}

