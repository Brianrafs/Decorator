package org.example.Data;

public interface DataSource {
    void writeData(String data);
    String readData();
}