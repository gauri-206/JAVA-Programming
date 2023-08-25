class Marvellous
{
    public int No1;
    public int No2;
    public Marvellous()
    {
        System.out.println("Inside default constructor");     
        No1 = 0;
        No2 = 0;
    }
    public Marvellous(int a, int b)
    {
        System.out.println("Inside parameterised constructor");       
    }
    protected void finalize()
    {
        System.out.println("Inside finalize Method");        
    }
}

class FinalizeDemo
{
    public static void main(String Arg[])
    {
        Marvellous mobj1 = new Marvellous();
        Marvellous mobj2 = new Marvellous(11, 21);

        mobj1 = null;
        mobj2 = null;
        System.gc();
    }
}