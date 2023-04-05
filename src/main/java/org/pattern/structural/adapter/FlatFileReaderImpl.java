package org.pattern.structural.adapter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlatFileReaderImpl implements FlatFileReader{
    private String filePath;

    public FlatFileReaderImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<String[]> readData() {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                data.add(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
