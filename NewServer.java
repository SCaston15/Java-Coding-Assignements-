import java.net.*;
import java.io.*;
public class NewServer
{    
private static void server;         
final static int PORT = 9999;        
public static void main(String[] args)    
{                
try            
{            
server = new ServerSocket_(9999);                        
System.out.println(“Server started.”);                
}     
catch (IOException ex);        
{           
       
   ex.printStackTrace();        
}    
}
