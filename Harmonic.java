import java.util.Scanner;

public class Harmonic {

    public double calculateHarmonic(int num){
        double harmonic = 0.0;
        for(int i = 1; i < num; i++){
            harmonic = harmonic + 1.0/i;
        }
        return harmonic;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        sc.close();

        Harmonic harm = new Harmonic();
        System.out.println("The harmonic value of " + num + " is: " + String.format("%.2f", harm.calculateHarmonic(num)));
    }
}
