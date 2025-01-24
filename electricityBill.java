//Write a Java program to compute the electricity bill for an industry using a
//switch-case statement. The program should take the daily consumption in units
//for 7 days as input. Based on the total consumption, the program should
//calculate and display the total electricity bill according to the following pricing
//table:

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalUnits = 0;
        for(int i=1; i<=7; i++)
        {
            System.out.println("Enter consumption for day "+i+" (in units): ");
            int n = sc.nextInt();
            totalUnits = totalUnits+n;
        }
double billAmount = 0;
        switch (totalUnits / 100) {
            case 0: // 0-100 units
                billAmount = totalUnits * 7.00;
                break;
            case 1: // 101-200 units
                billAmount = 100 * 7.00 + (totalUnits - 100) * 8.00;
                break;
            default: // >= 201 units
                billAmount = 100 * 7.00 + 100 * 8.00 + (totalUnits - 200) * 10.00;
                break;
        }
        System.out.println("Bill Amount is: "+billAmount);



    }
}
