import java.util.Scanner;

public class CountObjects {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int j = 0; j < i; j++)
            new Obj();
        System.out.println(Obj.count); //classname 'dot' static member

    }
}
class Obj
{
    static int count = 0;
    public Obj()
    {
        count++;
    }
    public void show()
    {
        System.out.println(count);
    }
}