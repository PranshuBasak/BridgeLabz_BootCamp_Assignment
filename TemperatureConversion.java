import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Enter Your Choice ,
                 F for Fahrenheit to Celsius Conversion\s
                 Or C for Celsius to Fahrenheit Conversion""");
        char Ch = scan.next().charAt(0);
        float F, C;
        switch (Ch) {
            case 'f', 'F' -> {   //Enhanced sWITCH cASE
                System.out.println("Enter Fahrenheit:");
                F = scan.nextFloat();
                C = (F - 32) * 5 / 9;
                System.out.println("Celsius Value :" + C);
            }
            case 'c', 'C' -> {
                System.out.println("Enter Celsius:");
                C = scan.nextFloat();
                F = ((9 * C) / 5) + 32;
                System.out.println("Fahrenheit Value : "+ F);
            }
            default -> System.out.println("Invalid Choice");
        }

    }

}
