import java.util.*;

class LargestWord
{
    public  static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String str = sobj.nextLine();
        int length = str.length();

        int res = 0, curr_len = 0;
        for (int i = 0; i < length; i++)
        {
        // If current character is not
        // end of current word.
           if (str.charAt(i) != ' ')
                 curr_len++;
 
        // If end of word is found
           else
           {
                res = Math.max(res, curr_len);
                curr_len = 0;
            }
        }
        return res;
    }
}
