package org.pattern.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        StockData apple = new StockData("Apple", 100.0);
        StockData google = new StockData("Google", 200.0);

        StockObserver user1 = new StockObserver("User1");
        StockObserver user2 = new StockObserver("User2");

        apple.registerObserver(user1);
        apple.registerObserver(user2);
        google.registerObserver(user2);

        apple.setStockPrice(110.0);
        google.setStockPrice(190.0);
    }
}
