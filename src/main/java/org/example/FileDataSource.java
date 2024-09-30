package org.example;

import org.example.Data.DataSource;

public class FileDataSource implements DataSource {
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Escrevendo dados em arquivo: " + filename);
    }

    @Override
    public String readData() {
        System.out.println("Lendo dados do arquivo: " + filename);
        return "dados do arquivo";
    }
}