import java.util.Scanner;

public class Swap {

    public static void swap(int num1, int num2){
        System.out.println("before swap: num1 = " + num1 + ", num2 = " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("after swap: num1 = " + num1 + ", num2 = " + num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        sc.close();

        swap(num1, num2);
    }
}
