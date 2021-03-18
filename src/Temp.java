abstract class A
{
    public void show(){
        System.out.println("Hello");
    }
}


class B extends A
{
    @Override
    public void show(){
        System.out.println("Holla!");
    }
}
public class Temp {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

    }

}
