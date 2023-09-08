import java.util.Scanner;
public class CalculatorProgram {
    static class Calculator{
        public int addition(int a,int b){
            return a+b;
        }
        public int subtraction(int a, int b){
            return a-b;
        }
        public int multiplication(int a,int b){
            return a*b;
        }
        public int division(int a,int b){
            return a/b;
        }

    }
    public static void main(String[] args) {
        System.out.println("Calculator Program");
        System.out.println("---------------------------------");
        System.out.println("""
                Select Anyone Option
                (1) Addition
                (2) Subtraction
                (3) Multiplication
                (4) Division
                (5) Exit""");
        Scanner scan = new Scanner(System.in);
        int o = scan.nextInt();
        if(o == 5) {
            System.out.println("Exiting Program");
            return;
        }

        System.out.println("Enter First value");
        int a = scan.nextInt();
        System.out.println("Enter Second  value");
        int b = scan.nextInt();
        Calculator calc = new Calculator();

        switch (o) {
            case 1:
                int add = calc.addition(a,b);
                System.out.println("Adding a and b = "+ add );
                break;
            case 2:
                int sub = calc.subtraction(a,b);
                System.out.println("Subtracting a and b = "+ sub );
                break;
            case 3:
                int mul = calc.multiplication(a,b);
                System.out.println("Multiplication a and b = "+ mul );
                break;
            case 4:
                int div = calc.division(a,b);
                System.out.println("Dividing a and b = "+ div );
                break;
            default:
                System.out.println("Choose Correct Option");
                break;
        }

        System.out.println("Calculator Program Closed");
        scan.close();


    }

}

