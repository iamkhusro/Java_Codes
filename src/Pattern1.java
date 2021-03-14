import java.util.*;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,k;

        for(i = 0; i < n; i++)
        {
            if(i == 0 || i == (n-1))
            {
                for(j = 0; j < n; j++)
                    System.out.print("* ");
                System.out.println();
                continue;
            }
            System.out.print("* ");
            for(j = 1; j < n-1; j++)
                System.out.print("  ");
            System.out.println("* ");

        }
    }
}
