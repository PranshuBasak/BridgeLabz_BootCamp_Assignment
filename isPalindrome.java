import java.util.*;

public class isPalindrome {
    public static boolean checkPalindrome(String str) {
        boolean isPalindrome = true;
        String lStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0; i < (lStr.length() / 2); i++) {
            if (lStr.charAt(i) != lStr.charAt(lStr.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int numStrings = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] strings = new String[numStrings];

        for (int i = 0; i < numStrings; i++) {
            System.out.print("Enter string #" + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        scanner.close();

        for (String str : strings) {
            boolean isPalindrome = checkPalindrome(str);
            System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);
        }
    }
}
