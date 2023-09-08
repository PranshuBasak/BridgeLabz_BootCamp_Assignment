import  java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Month m");
        int m = scan.nextInt();
        System.out.println("Enter Day d");
        int d = scan.nextInt();
        if((m >= 1  && m <= 12  ) && (d >= 1 && d <= 30)){
            System.out.println("true");

        }else{
            System.out.println("false");

        }


    }
}
