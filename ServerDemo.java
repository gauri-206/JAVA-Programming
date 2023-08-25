import java.net.*;
import java.io.*;

class ServerDemo 
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is Running..........");
        ServerSocket aobj = new ServerSocket(4100);
        System.out.println("Server socket is running at port no: 3100");

        Socket s = aobj.accept();
        System.out.println("Server and Client connection is created.....");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader b1 = new BufferedReader (new InputStreamReader(s.getInputStream()));
        BufferedReader b2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("chat will be started.........");
        String str1, str2;
        while((str1 = b1.readLine()) != null)
        {
            System.out.println("Client says:  "+str1);
            System.out.println("Enter message for client:   ");
            str2 = b2.readLine();
            ps.println(str2);
        }
        System.out.println("Thanks for using chat messanger......!!!!!");
    }
}
