import java.util.Scanner;

public class Quadratic {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a :");
        double a = scan.nextInt();
        System.out.println("Enter value of b :");
        double b = scan.nextInt();
        System.out.println("Enter value of b :");
        double c = scan.nextInt();
        double delta = b*b - (4*a*c);
        System.out.println(delta);
        if(delta >= 0){
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 is: " + root1);
            System.out.println("Root 2 is: " + root2);
        }else{
            System.out.println("No real root present");

        }




    }

}
