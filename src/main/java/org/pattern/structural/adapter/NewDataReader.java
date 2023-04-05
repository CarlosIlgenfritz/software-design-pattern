package org.pattern.structural.adapter;

import java.util.List;
import java.util.Map;

public interface NewDataReader {
    List<Map<String, String>> readData();
}
