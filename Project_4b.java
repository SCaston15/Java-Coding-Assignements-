/*
Stephanie Caston
Project 4a 
3/11/2014
ITCS 2214
*/
import java.text.DecimalFormat; 
public class Project_4b 
{
	public static void main(String args[])
   {
      //hardcodes the expressions into an array 
      String[] infix = {"a+b-c", "a-b+c", "e*f*g", "e+f/g*h-k", "a*b+c*d-e/f"
      +"a/d/c/d", "a-b-c/d-e-f*g/h-k", "a+b*c+d/e-f*g+h/k"};
      
      DecimalFormat myFormatter = new DecimalFormat("#0.00");

      //creates a loop to call each expression and evalutate them individually 
      for(int j=0; j<infix.length; j++)
      {
      
      //places each expression into each class, converting to postfix, and then evaluates
      //the postfix expression. 
      System.out.println("Infix: " +  infix[j]);
      System.out.println("Postfix: " + infixToPostfix(infix[j])); 
      System.out.println("Evaluation: " + infix[j] + " = " 
      + myFormatter.format(evaluate(infixToPostfix(infix[j])))); 
   
      System.out.println(" ");
   }
   }
 
//The class that converts each string into a postfix expression 
private static String infixToPostfix(String infix) 
{
    int length = infix.length();
    char c; 
    String postfix = "";  
    
    //Initializes the stack 
    Stack<Character> characterStack = new LStack<Character>();
    
    //creates a loop that evaluates each character of the expression
    for(int i=0; i<infix.length(); i++)
    {
      
      c=infix.charAt(i);
      //if characters is a letter it is added to the postfix expression
      if(c != '+' && c != '-' && c != '/'  && c!= '*')
      {
         postfix = postfix + c; 
      }
      //if the characters is an operator and if the stack is empty, the operator
      //is pushed into the stack. 
      else if(c == '+' || c == '-' || c == '/' || c == '*') 
      {
         if(characterStack.length()== 0) 
         {
            characterStack.push(c); 
         }
            else
            {  
               //Else if the value of the operator is lower than the value of the top
               //operator in the stack, the stack is popped and the top element
               //is added to the stack. 
               while(precedenceLevel(c)<=precedenceLevel(characterStack.topValue()))
               { 
                  postfix = postfix + characterStack.pop();
               //when the stack is empty the loop is ended and the operator is pushed 
               //into the stack 
               if(characterStack.length()==0)
               break;
               }
                  characterStack.push(c);  
               }
           }
      } 
      // While the stack is not empty, the top operator in the stack is popped and added 
      //to the postfix expression 
      while(characterStack.length()!=0)
      { 
         postfix = postfix + characterStack.pop(); 
      }
      //returns the final postfix expression 
      return postfix; 
      }
       
//class that assigns numeric values to operators 
private static int precedenceLevel(char c) 
    {
    switch (c) 
    {
        case '+':
        case '-':
            return 0;
        case '*':
        case '/':
            return 1;
        default:
            throw new IllegalArgumentException("Operator unknown: " + c);
    }
    
 }
 
//Class that evalates the postfix expression 
private static double evaluate(String postfix) 
{
	       //initializes the stack 
           Stack<Double> evaluation = new LStack<Double>();
	        
           //for loop that evaluates each character of the postfix expression 
	        for (int i = 0; i<postfix.length(); i++) 
           {
               //evaluates each character 
               char c = postfix.charAt(i);
               //if the character is a letter then convert it to its number assignement 
               //and push it into the stack. 
	            if(c != '+' && c != '-' && c != '*' && c != '/')
               {  
                  evaluation.push(numberAssignment(c));
	            }
               //if the character is an operator, the stack is popped twice
	            else if(c == '+' || c == '-' || c == '*' || c == '/') 
               {
                   double opTwo = evaluation.pop(); 
	                double opOne = evaluation.pop();
                   
                   //counter initialized 
	                double result = 0;
	                
                   //performs the operations the find the value of the postfix expression
                   //using the two popped values and the operators in the expression
	                switch (c) 
                   {
	                case '*':
	                    result = opOne * opTwo;
	                    break;
	                case '/':
	                    result = opOne / opTwo;
	                    break;
	                case '+':
	                    result = opOne + opTwo;
	                    break;
	                case '-':
	                    result = opOne - opTwo;
	                    break;
	                }
                   //culminated result is then pushed into the stack. 
	                evaluation.push(result);
	            }
	        }  
           //The result is popped and returned. 
	        return evaluation.pop();
	    }
//Assigns number values to letters a - k 
private static double numberAssignment(char c) 
{
 switch (c) 
 {
   case 'a':
       return 5;
   case 'b':
       return 3; 
   case 'c':
       return 8; 
   case 'd': 
       return 20; 
   case 'e':
       return 18;
   case 'f':
       return 9;
   case 'g':
       return 12; 
   case 'h':
       return 7; 
   case 'k': 
       return 1;  
   default:
       throw new IllegalArgumentException("Operator unknown: " + c);}
}
}