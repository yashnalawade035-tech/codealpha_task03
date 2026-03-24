package CodeAlpha_StockTradingPlatform;

public class Transaction {

    private String type;        // Buy or Sell
    private String stockName;   // Name of stock
    private int quantity;       // Number of shares
    private double price;       // Price per share

    // Constructor
    public Transaction(String type, String stockName, int quantity, double price) {
        this.type = type;
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter Methods
    public String getType() {
        return type;
    }

    public String getStockName() {
        return stockName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Method to calculate total value
    public double getTotalAmount() {
        return quantity * price;
    }

    // Display transaction details
    public void displayTransaction() {
        System.out.println("Transaction Type : " + type);
        System.out.println("Stock Name       : " + stockName);
        System.out.println("Quantity         : " + quantity);
        System.out.println("Price per Share  : ₹" + price);
        System.out.println("Total Amount     : ₹" + getTotalAmount());
        System.out.println("----------------------------------");
    }
}
