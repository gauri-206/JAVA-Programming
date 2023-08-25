class Generic2
{
    public static <T> void Display(T Arr[])     //we can use any other letter 
    {
        for(T no : Arr)       // foreach loop
        {
            System.out.println(no);
        }
    }


    public static void main(String Arg[])
    {
        Integer A[] = {10, 20, 30, 40};
        Float B[] = {50.6f, 60.5f, 70.6f};
        Double C[] = {50.45, 56.74, 76.95};

        Display(A);
        Display(B);
        Display(C);

    }
}