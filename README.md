CodeAlpha_StockTradingPlatform

A Java-based console application simulating a simple stock market where users can manage a virtual investment portfolio. Users can buy/sell stocks, track their cash balance, and monitor holdings through an interactive command-line interface.

🚀 Features
View Stocks: Check current market prices of available stocks (e.g., TCS, Infosys).
Buy Stock: Purchase stocks by specifying quantity, with balance validation.
Sell Stock: Sell owned stocks, ensuring sufficient holdings before the transaction.
View Portfolio: See all stocks owned and remaining cash balance.
Exit: Close the application safely.
🛠️ Technologies Used
Language: Java 11+
Libraries: java.util.Scanner, java.util.HashMap
Concepts: OOP, Encapsulation, Data Validation, CLI Input Handling
📂 Project Structure
Main.java – Entry point; initializes market stocks and user.
User.java – Manages user balance and portfolio with validation logic.
Stock.java – Represents stock objects with name and price.
Transaction.java – Records individual trades (Buy/Sell, quantity, total).
📋 How to Run
Clone the repository:
git clone https://github.com/your-username/CodeAlpha_StockTradingPlatform.git
cd CodeAlpha_StockTradingPlatform
Compile the source code:
javac *.java
Run the application:
java Main
🕹️ Usage

Follow the menu to view stocks, buy/sell shares, check your portfolio, or exit the program. The application ensures safe transactions and keeps your portfolio updated in real time.
