public class CallbyRef
{
    public static void main(String[] args)
    {
        Paper p = new Paper();
        p.setValue("Hahaha!");
        System.out.println(p.value);
        Print ob = new Print();
        ob.set(p);
        System.out.println(p.value);
    }
}

class Print
{
    public void set(Paper a)
    {
        a.value = "Heya!";
    }

}

class Paper
{
    String value;
    public void setValue(String s)
    {
        value = s;

    }

}
