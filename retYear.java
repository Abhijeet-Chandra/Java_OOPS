import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the year in which you were born: ");
            int y = sc.nextInt();

            System.out.println("Enter the date in which you were born: ");
            int d = sc.nextInt();
            if(d>31 || d<=0)
            {
                System.out.println("Enter a valid date");
                continue;
            }
            System.out.println("Enter the month in which you were born: ");
            int m = sc.nextInt();
            if(m>12 || m<=0)
            {
                System.out.println("Enter a valid month");
                continue;
            }

            if((m==4||m==6||m==9||m==11)&&d>30)
            {
                System.out.println("Enter a valid month");
                continue;
            }

            if((m==2)&&((y % 4 == 0 && y % 100 != 0) || ( y % 400 == 0))&&d>29)
            {{
                System.out.println("Enter a valid month");
                continue;
            }}

            if(m==2 && d>28)
            {
                System.out.println("Enter a valid month");
                continue;
            }

            int e = y+60;
            System.out.println("year of retirement is: " +d+"-"+m+"-"+e);
            break;
        }


    }
}
