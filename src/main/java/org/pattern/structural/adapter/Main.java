package org.pattern.structural.adapter;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a FlatFileReader instance
        FlatFileReader flatFileReader = new FlatFileReaderImpl("data.txt");

        // Create a FlatFileReaderAdapter instance
        NewDataReader newDataReader = new FlatFileReaderAdapter(flatFileReader);

        // Use the NewDataReader interface to read data in the new format
        List<Map<String, String>> newData = newDataReader.readData();

        // Process the new data
        for (Map<String, String> data : newData) {
            System.out.println("Name: " + data.get("name"));
            System.out.println("Age: " + data.get("age"));
            System.out.println("Address: " + data.get("address"));
        }
    }
}
