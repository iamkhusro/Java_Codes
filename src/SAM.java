interface Abc //Single Abstract Method or Functional Interface
{
    void show();
}

public class SAM
{
    public static void main(String[] args)
    {
        Abc obj = () -> System.out.println("Hello"); //lambda expression
        obj.show();
    }


}
