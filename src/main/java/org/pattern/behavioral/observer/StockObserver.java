package org.pattern.behavioral.observer;

public class StockObserver implements Observer{
    private String observerName;

    public StockObserver(String observerName) {
        this.observerName = observerName;
    }

    public void update(String stockName, double stockPrice) {
        System.out.println(observerName + " - " + stockName + " price changed to: " + stockPrice);
    }
}
