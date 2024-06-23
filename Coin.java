import java.util.Random;
import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times coin flip: ");
        int num = sc.nextInt();
        

        if(num <= 0 ){
            System.out.println("Number should be positive");
            return;
        }

        sc.close();
        
        
        int headCount = 0;
        int tailCount = 0;

        Random random = new Random();
        
        for(int i = 0; i < num; i++){
            double input = random.nextDouble();

            if(input < 0.5){
                tailCount++;
            }
            else{
                headCount++;
            }
        }

        double per_head = (double) headCount/num * 100;
        double per_tail = (double) tailCount/num * 100;

        System.err.println("Percentage of having tail is: " + String.format("%.2f", per_tail) + "%");
        System.out.println("Percentage of having head is: " + String.format("%.2f", per_head) + "%");

        

    }
}
