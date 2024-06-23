import java.util.Scanner;

public class Power {

    public void calculatePower(int power){
        System.out.println("The power of 2 is:");
        for(int i = 1; i <= power && power < 31; i++){
            System.out.println("2^" + i + " = " + (int)Math.pow(2, i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the power number: ");
        int power = sc.nextInt();
        sc.close();

        Power pow = new Power();
        pow.calculatePower(power);


    }
}
