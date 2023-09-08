import java.util.Scanner;
public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stock Account Management Program");
        System.out.println("--------------------------------");
        System.out.println("Input Number of Stock: ");
        int n = scan.nextInt();
        int totalStock = 0;
        Stock stock = new Stock();
        for (int i = 0; i < n; i++) {
            System.out.println("Input Share Name: \n");
            scan.nextLine();
            String shareName = scan.nextLine();
            System.out.println("Input Share Number: ");
            int shareNo = scan.nextInt();
            System.out.println("Input Share Price: ");
            int sharePrice = scan.nextInt();
            int valueOfSingleStock = stock.stockCalculate(shareNo,sharePrice);
            System.out.println("Stock Name: "+ shareName +" & Stock value: "+ valueOfSingleStock);
            totalStock += valueOfSingleStock;
        }
            System.out.println("Total Stock Value: "+totalStock);
            System.out.println("Stock Account Management Program Closed");
            scan.close();
    }

    static class Stock {
        public int stockCalculate(int shareNo,int sharePrice){
            return shareNo*sharePrice;
        }
    }
}
