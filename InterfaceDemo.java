interface Circle
{
    public final float PI = 3.14f;

    public float CalculateArea(float Radius);
    public float CalculateCircumference(float Radius);
}

class Demo implements Circle
{
    public float CalculateArea(float Radius)
    {
        return PI * Radius;
    }
    public float CalculateCircumference(float Radius)
    {
        return 2* PI * Radius;
    }
}

class InterfaceDemo {
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        float fRet = 0.0f;

        fRet = obj.CalculateArea(10.5f);
        System.out.println("Area is: "+fRet);

        fRet = obj.CalculateCircumference(32.5f);
        System.out.println("Circumference is: " +fRet);
    }
}
