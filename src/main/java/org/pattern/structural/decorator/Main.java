package org.pattern.structural.decorator;

public class Main {
    public static void main(String[] args) {

        INotifier notifyAll = new FacebookDecorator(new WhattsAppDecorator(new Notifier("Carlos")));
        notifyAll.send("Notification");

        System.out.println("==========================================");

        INotifier notifyFbMail = new FacebookDecorator(new Notifier("Eduardo"));
        notifyFbMail.send("Notification by email");

    }
}
