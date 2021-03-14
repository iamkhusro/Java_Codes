import java.util.Calendar;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt();
        m--;
        Calendar c = Calendar.getInstance();
        c.set(y,m,d);

        int dow = c.get(Calendar.DAY_OF_WEEK);
        String res = "";
        switch(dow)
        {
            case 1:
                res = "SUNDAY";
                break;
            case 2:
                res = "MONDAY";
                break;
            case 3:
                res = "TUESDAY";
                break;
            case 4:
                res = "WEDNESDAY";
                break;
            case 5:
                res = "THURSDAY";
                break;
            case 6:
                res = "FRIDAY";
                break;
            case 7:
                res = "SATURDAY";
                break;

        }
        System.out.println(res);


    }
}

