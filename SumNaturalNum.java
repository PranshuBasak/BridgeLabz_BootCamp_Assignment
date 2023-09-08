import java.util.Scanner;

public class SumNaturalNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int sum = 0,s = scan.nextInt();
        for(int i = 0; i<= s;i++){
            sum += i;
        }
        System.out.println("Sum of all Natural Numbers of Given Value: " + sum);
    }

}