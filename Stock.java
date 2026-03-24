package CodeAlpha_StockTradingPlatform;

public class Stock {
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public String getStockName() {
        return stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayStock() {
        System.out.println("Stock: " + stockName + " | Price: ₹" + price);
    }
}
