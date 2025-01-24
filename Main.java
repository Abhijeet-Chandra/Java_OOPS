//Write a Java programs to print factorial of a given no recursively.
import java.util.*;
public class Main {

    static class FactClass
    {
        static int fac(int n, int i, int factorial)
        {

            if(i==n+1)
                return factorial;
            factorial= factorial*i;
            return fac(n, i+1, factorial);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial is: "+FactClass.fac(n,1, 1));
    }
}