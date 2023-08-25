class Derived
{
    public int a;
    
    public Derived()
    {
        this(11);
        System.out.println("Inside Default..");
    }
    public Derived(int i)
    {
        System.out.println("Inside Parameterised..");
        this.a = i;
    }
}

class ThisDerived
{
    public static void main(String Arg[])
    {
        Derived dobj = new Derived();
    }
}