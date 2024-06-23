import java.util.Scanner;

public class PrimeFactors {

    public static void primeFactors(int num){

        while(num % 2 == 0){
            System.out.println(2 + " ");
            num /= 2;
        }

        for(int i = 3; i*i <= num; i += 2){
            if(num % i == 0){
                System.out.println(i + " ");
                num /= i;
            }
        }

        if(num > 2){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        primeFactors(num);

    }
}
