import  java.util.Scanner;
public class IntOpt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number a");
        int a = scan.nextInt();
        System.out.println("Enter Number b");
        int b = scan.nextInt();
        System.out.println("Enter Number c");
        int c = scan.nextInt();
        System.out.println("Output will be" + (a+b*c) + " " + (a*b+c) + " " );


    }
}
