import java. io.*;

class InputDemo
{
    public static void main(String Arg[])  throws IOException
    {
        BufferedReader bobj = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("Enter first number: ");
        int No1 = Integer.parseInt(bobj.readLine());     //Error

         System.out.println("Enter second number: ");
        int No2 = Integer.parseInt(bobj.readLine());     //Error

        int Ans = No1 + No2;

        System.out.println("Addition is : "+Ans);
    }
}