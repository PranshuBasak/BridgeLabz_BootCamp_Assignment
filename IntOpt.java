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
        System.out.println("Output a + b * c= " + (a+(b*c)) + ", " +
                "\n a * b + c= " + ((a*b)+c) + ",\n  c + a / b= "
                + (c+(a/b)) + ",\n  and a % b + c= " + ((a%b)+c));

        System.out.println("Max number between a and  b is : "+  Math.max(a,b));
        System.out.println("Min number between a and  b is : "+  Math.min(a,b));



    }
}
