package org.pattern.behavioral.templatemethod;

public class CSVFile extends File {

    public void open(String path) {
        System.out.println("Opening the file inside " + path);
    }

    @Override
    public void close() {
        System.out.println("Closing...");
    }
}
