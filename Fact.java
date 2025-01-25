import java.math.BigInteger;
import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            BigInteger fact = BigInteger.ONE; 
            for (int i = 1; i <= n; i++) {
                fact = fact.multiply(BigInteger.valueOf(i)); 
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }

        sc.close();
    }
}
