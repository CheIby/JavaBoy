package Week4;

public class Pro1_64010845 {
    public static void main(String[] args) {
        Stock stock = new Stock("Oracle Coperation", "ORCL");
        stock.SetPreviousClosingPrice(34.5);
        stock.SetCurrentPrice(34.35);
        System.out.println("Symbol: " + stock.getSymbol());
        System.out.println("Name: " + stock.getName());
        System.out.println("Previous Closing Price: " + stock.getPrevious());
        System.out.println("Current: " + stock.getCurrent());
        System.out.println("Price Change: " + stock.getChangePercent() + "%");
    }
}

class Stock {
    private String name;
    private String symbol;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public void SetPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void SetCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getPrevious() {
        return this.previousClosingPrice;
    }

    public double getCurrent() {
        return this.currentPrice;
    }

    public double getChangePercent() {
        return ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
    }
}
