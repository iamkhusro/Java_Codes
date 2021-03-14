import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j = 1;
        int s;
        if(n == 1)
            System.out.print(0);
        else if(n > 1) {
            System.out.print(0+" ");
            System.out.print(1+" ");
        }
        for(int k = 3; k <= n; k++)
        {
            s = i + j;
            System.out.print(s+" ");
            i=j;
            j=s;

        }
        System.out.println();

    }
}
