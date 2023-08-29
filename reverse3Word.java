import java.util.Scanner;

public class reverse3Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first friend's name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second friend's name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter the third friend's name: ");
        String name3 = scanner.nextLine();
        //Reversing A String
        StringBuilder reversed = new StringBuilder(name3).reverse();
        String nameReverse = reversed.toString();
        System.out.println("Hi " + name3 + ", " + name2 + ", and " + name1 + ".");
        System.out.println(nameReverse);
        String reverse2 = "";

        String name4  = args[0];
        String name5  = args[1];
        String name6  = args[2];

        System.out.println("Hi " + name6 + ", " + name5 + ", and " + name4 + ".");


        for(int i = name2.length()-1 ; i >= 0; i--){
            reverse2 += name2.charAt(i);
        }
        System.out.println(reverse2);
        scanner.close();
    }
}
