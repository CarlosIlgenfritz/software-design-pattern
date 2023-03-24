package org.pattern.behavioral.templatemethod;

abstract class File {

    public abstract void open(String path);

    public void createReport() {
        System.out.println("Creating the report...");
    }

    public abstract void close();
}
