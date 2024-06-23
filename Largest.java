import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        sc.close();

        if(num1 > num2 && num1 > num3){
            System.out.println("the number " + num1 + " is greater than " + num2 + " and " + num3);
        }
        if(num2 > num1 && num2 > num3){
            System.out.println("the number " + num2 + " is greater than " + num1 + " and " + num3);
        }
        else{
            System.out.println("the number " + num3 + " is greater than " + num1 + " and " + num2);
        }
    }
}
