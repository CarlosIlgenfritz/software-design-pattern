package org.pattern.behavioral.templatemethod;

public class Main {

    public static void main(String[] args) {
        CSVFile csvFile = new CSVFile();

        csvFile.open("archive.csv");
        csvFile.createReport();
        csvFile.close();
    }
}
