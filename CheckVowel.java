import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Character");
        char c = scan.next().charAt(0);
        char l = Character.toLowerCase(c);
        if(Character.isDigit(l)){

            System.out.println("Input Valid Character");
        }else {
            switch (l) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("It is a Vowel");
                    break;
                default:
                    System.out.println("It is a Consonant");
            }
        }
    }
}