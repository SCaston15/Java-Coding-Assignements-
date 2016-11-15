import java.net.*;
import java.io.*;

public class NewServer
{
    //Create a socket for the server to be setup on.
    private static void server;
    
    //Establish a Port Number for the server.
    final static int PORT = 9999;
    
    //Main Execution
    public static void main(String[] args)
    {
        //Catch any exceptions raised in transmission.
        try
        {
            //Create the server’s access point.
            server = new ServerSocket_(9999);
            //Print a confirmation message to the console.
            System.out.println(“Server started.”);
        }
        //Catch a possible exception.
        catch (IOException ex)
        {
            //Tell the server what threw the exception.
            ex.printStackTrace();
        }
    }
}
