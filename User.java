package CodeAlpha_StockTradingPlatform;

import java.util.HashMap;

public class User {
    private String name;
    private double balance;
    private HashMap<String, Integer> portfolio;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.portfolio = new HashMap<>();
    }

    public void buyStock(String stockName, int quantity, double price) {
        double totalCost = quantity * price;

        if (balance >= totalCost) {
            balance -= totalCost;
            portfolio.put(stockName, portfolio.getOrDefault(stockName, 0) + quantity );
            System.out.println("Stock purchased successfully!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void sellStock(String stockName, int quantity, double price) {
        if (portfolio.containsKey(stockName) && portfolio.get(stockName) >= quantity) {
            balance += quantity * price;
            portfolio.put(stockName, portfolio.get(stockName) - quantity);
            System.out.println("Stock sold successfully!");
        } else {
            System.out.println("Not enough stocks to sell!");
        }
    }

    public void displayPortfolio() {
        System.out.println("Portfolio: " + portfolio);
        System.out.println("Balance: ₹" + balance);
    }
}
