public class Varargs {
    public static void main(String[] args)
    {
        Disp obj = new Disp();
        obj.show(5);
        Disp obj1 = new Disp();
        obj1.show(6,7,9);

    }
}

 class Disp
{
    public void show(int a)
    {
        System.out.println(a+" show a");
    }

    public void show(int ... a) //used when number of arguments are not known. arguments stored in a[]
    {
        for(int i : a)
        {
            System.out.println(i);
        }
    }
}
