import java.util.Scanner;
public class RandomNumber {
    public static void main(String []args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your Range Starting Point:");
        int x = scan.nextInt();
        System.out.println("Input your Range Ending Point:");
        int y = scan.nextInt();
        double rnd = (int) Math.floor(Math.random()*(y-x))+x;
        System.out.println("Your Random number: " + rnd);
    }
}
