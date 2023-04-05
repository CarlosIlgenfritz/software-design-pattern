package org.pattern.structural.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlatFileReaderAdapter implements NewDataReader {
    private final FlatFileReader flatFileReader;

    public FlatFileReaderAdapter(FlatFileReader flatFileReader) {
        this.flatFileReader = flatFileReader;
    }

    @Override
    public List<Map<String, String>> readData() {
        List<String[]> flatFileData = flatFileReader.readData();
        List<Map<String, String>> newData = new ArrayList<>();
        for (String[] data : flatFileData) {
            Map<String, String> mappedData = new HashMap<>();
            mappedData.put("name", data[0]);
            mappedData.put("age", data[1]);
            mappedData.put("address", data[2]);
            newData.add(mappedData);
        }
        return newData;
    }
}
