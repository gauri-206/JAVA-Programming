class StringDemo2
{
    public static void main(String A[])
    {
      

        String str2 = "Hello";

        String str3 = new String("Hello");

        if(str2 == str3)
        {
            System.out.println("Strings are equal..");
        }
        else
        {
            System.out.println("Strings are not equal..");
        }

        if(str2.equals (str3))
        {
            System.out.println("Strings are equal..");
        }
        else
        {
            System.out.println("Strings are not equal..");
        }

    }
}