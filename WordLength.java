import java.util.*;

class WordLength
{
    public  static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String str = sobj.nextLine();
        int length = str.length();

        System.out.println("Lenth of the word: "+length);
    }
}