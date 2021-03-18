interface Abc
{
    void show();
}

public class SAM //Single Abstract Method or Functional Interface
{
    public static void main(String[] args)
    {
        Abc obj = () -> System.out.println("Hello"); //lambda expression
        obj.show();
    }


}
