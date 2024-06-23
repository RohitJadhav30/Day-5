import java.util.Scanner;

public class EvenOrOdd {

    public static void isEven(int number){
        if(number % 2 == 0){
            System.out.println("The number is even number");
        }
        else{
            System.out.println("The number is odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: "); 
        int number = sc.nextInt();
        sc.close();

        isEven(number);
    }
}
