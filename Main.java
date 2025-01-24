//For given a 9-digit registration number of a CSE student, identify the year of
//joining. Assuming the first two digits specify the year of joining.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter registration number: ");
        int regNo = sc.nextInt();
        String reg = Integer.toString(regNo);
        System.out.println("Your year of joining is: 20"+reg.charAt(0)+reg.charAt(1));
    }
}