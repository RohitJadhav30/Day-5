import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the divident: ");
        int divident = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        sc.close();

        int quotient = divident/divisor;
        System.out.println("The Quotient is: " + quotient);

        int remainder = divident % divisor;
        System.out.println("the remainder is: " + remainder);

    }
}
