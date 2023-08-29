import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Value u want to reverse");
        if (scan.hasNextInt()) {
            int n = scan.nextInt();
            int temp = n;
            while (n != 0) {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;

            }
            System.out.println(temp == rev ? "Palindrome Number" : "Not a Palindrome Number");
            System.out.println("Reverse Number is " + rev);
        } else {

            System.out.println("Give input in Integer Format");
        }

        scan.close();
    }
}
