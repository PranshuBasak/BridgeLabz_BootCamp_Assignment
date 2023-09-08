import java.util.Scanner;
public class Distances {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X value");
        int x = scan.nextInt();
        System.out.println("Enter Y value");
        int y = scan.nextInt();

        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

        System.out.println("Distances is "+  distance);
    }
}
