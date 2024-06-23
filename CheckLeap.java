import java.util.Scanner;

public class CheckLeap {

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();

        if(isLeapYear(year)){
            System.out.println("The year " + year + " is a leap year");
        }
        else{
            System.out.println("The year " + year + " is not a leap year");
        }


    }
}
