import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i,j,cnt;

        for(i = 1; i <= n; i++)
        {
            cnt = n;
            for(j = i; j <= n; j++)
            {
                System.out.print(j+" ");
                cnt--;

            }
            cnt++;
            for(j = 1; j < cnt; j++)
                System.out.print(j+" ");
            System.out.println();
        }

    }

}
