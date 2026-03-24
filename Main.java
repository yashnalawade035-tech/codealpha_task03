package CodeAlpha_StockTradingPlatform;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stock stock1 = new Stock("TCS", 3500);
        Stock stock2 = new Stock("Infosys", 1500);

        User user = new User("Yash", 100000);

        while (true) {
            System.out.println("\n1. View Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stock1.displayStock();
                    stock2.displayStock();
                    break;

                case 2:
                    System.out.print("Enter stock name: ");
                    String buyName = sc.next();
                    System.out.print("Enter quantity: ");
                    int buyQty = sc.nextInt();

                    if (buyName.equalsIgnoreCase("TCS"))
                        user.buyStock("TCS", buyQty, stock1.getPrice());
                    else if (buyName.equalsIgnoreCase("Infosys"))
                        user.buyStock("Infosys", buyQty, stock2.getPrice());
                    break;

                case 3:
                    System.out.print("Enter stock name: ");
                    String sellName = sc.next();
                    System.out.print("Enter quantity: ");
                    int sellQty = sc.nextInt();

                    if (sellName.equalsIgnoreCase("TCS"))
                        user.sellStock("TCS", sellQty, stock1.getPrice());
                    else if (sellName.equalsIgnoreCase("Infosys"))
                        user.sellStock("Infosys", sellQty, stock2.getPrice());
                    break;

                case 4:
                    user.displayPortfolio();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
