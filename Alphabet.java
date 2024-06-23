import java.util.Scanner;

public class Alphabet {

    public static void isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("The alphabet " + c + " is a vowel");
        }
        else{
            System.out.println("The alphabet " + c + " is a consonent");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        String c = sc.nextLine();
        char ch = c.charAt(0);
        sc.close();

        isVowel(ch);
    }
}
