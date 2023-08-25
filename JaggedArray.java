import java.util.*;

class JaggedArray
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int Row = sobj.nextInt();
        int Arr[][] = new int [Row][];

        System.out.println("Enter the number of columns: ");
        for(int i =0; i<Row ; i++)
        {
            Arr[i] = new int[sobj.nextInt()];
        }

        System.out.println("Enter the elements: ");
        for(int i=0; i<Arr.length; i++)
        {
            for(int j=0; j< Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        
        System.out.println("Entered elements are: ");
        for(int i=0; i<Arr.length; i++)
        {
            for(int j=0; j< Arr[i].length; j++)
            {
               System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}