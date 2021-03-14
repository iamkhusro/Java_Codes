public class AnonymousObject
{
    public static void main(String[] args) {
        new Anonymous().show(); // Anonymous object, without any reference(referenced object). memory efficient(not using stack memory for referencing). eligible for garbage collection.
    }
}

class Anonymous {
    public void show() {
        System.out.println("Hello");
    }
}