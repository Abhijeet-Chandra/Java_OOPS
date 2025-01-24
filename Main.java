//A Taxi service offers a new service based on travel distance. Write a Java
//        program to calculate the total distance traveled by considering the following
//        charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR
//        5/km.

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled: ");
        int dist = sc.nextInt();
        double totalfare = 0;
        if(dist>0 && dist<=5)
            totalfare = dist*10;
        else if(dist>5 && dist<=20)
            totalfare = 5*10+(dist-5)*8;
        else if(dist>20 && dist<=45)
            totalfare = 5*10 + 15*8 + (dist-20)*5;
        else {
            System.out.println("Invalid dist, try again");
            System.exit(0);
        }

        System.out.println("total fare is: "+totalfare);


    }
}