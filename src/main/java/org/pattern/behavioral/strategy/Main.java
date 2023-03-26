package org.pattern.behavioral.strategy;

public class Main {

    public static void main(String[] args) {
        SomeStrategy someStrategy = new SomeStrategyImpl();
        Context context = new Context(someStrategy);

        context.doSomething();

        OtherStrategy otherStrategy = new OtherStrategy();
        context.setSomeStrategy(otherStrategy);

        context.doSomething();
    }
}
