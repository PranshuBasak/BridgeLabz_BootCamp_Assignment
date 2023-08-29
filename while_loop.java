import java.util.Scanner;

public class while_loop {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number");
        int num = scan.nextInt();
        
        while (num != 0){
            System.out.println("You Entered: "+ num);
            System.out.println("Enter Again");
            num = scan.nextInt();

        }
        System.out.println("While loop Ended");
        System.out.println("String Loop Started");
        for(String arg: args){
            System.out.println(arg);
        }
        System.out.println("String Loop Ended");


    }

}