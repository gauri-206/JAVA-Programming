import java.util.*;
 
class LengthOfLargeWord
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String str = sobj.nextLine();

        System.out.println(LongestWordLength(str));
    }

    static int LongestWordLength(String str)
    {
    int n = str.length();
    int res = 0, curr_len = 0;
    for (int i = 0; i < n; i++)
    {
        if (str.charAt(i) != ' ')
            curr_len++;
 
        else
        {
            res = Math.max(res, curr_len);
            curr_len = 0;
        }
    }
    return Math.max(res, curr_len);
    }
}