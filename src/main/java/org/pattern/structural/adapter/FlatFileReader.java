package org.pattern.structural.adapter;

import java.util.List;

public interface FlatFileReader  {
    List<String[]> readData();
}
