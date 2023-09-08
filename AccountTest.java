import java.util.Scanner;
public class AccountTest {
    static class Account{
        public void debit ( int balance, int debitAmount){
        if (debitAmount > balance) {
            System.out.println("Debit amount exceeded account balance"
            + "\nYour Remaining Balance: " + balance);
        } else {
            System.out.println("Your Debited Amount is: " + debitAmount
            + "\nYour Account Balance is: " + (balance - debitAmount));
        }
    }
    }

    public static void main(String[] args) {
        System.out.println("Account program");
        System.out.println("---------------");
        Scanner scan = new Scanner(System.in);
        int balance = (int) Math.floor(Math.random() * 5000);
        System.out.println("Enter Debit Amount:");
        int debitAmount = scan.nextInt();
        System.out.println("Your Initial Account Balance: "+balance);
        Account accountTest = new Account();
        accountTest.debit(balance,debitAmount);
    }
}
