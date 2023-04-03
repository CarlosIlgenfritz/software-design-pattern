package org.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockData {
    private List<Observer> observers;
    private String stockName;
    private double stockPrice;

    public StockData(String stockName, double stockPrice) {
        this.observers = new ArrayList<>();
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);
        }
    }

    public void setStockPrice(double newPrice) {
        double oldPrice = stockPrice;
        stockPrice = newPrice;
        if (oldPrice != newPrice) {
            notifyObservers();
        }
    }
}
