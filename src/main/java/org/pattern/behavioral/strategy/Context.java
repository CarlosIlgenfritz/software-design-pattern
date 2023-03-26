package org.pattern.behavioral.strategy;

public class Context {
    private SomeStrategy someStrategy;

    public Context(SomeStrategy someStrategy) {
        this.someStrategy = someStrategy;
    }

    public void doSomething() {
        someStrategy.execute();
    }

    public void setSomeStrategy(SomeStrategy someStrategy) {
        this.someStrategy = someStrategy;
    }
}
