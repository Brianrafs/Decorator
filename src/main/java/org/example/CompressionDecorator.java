package org.example;

import org.example.Data.DataSource;

public class CompressionDecorator extends DataSourceDecorator {

    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressedData = compress(data);
        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decompress(data);
    }

    private String compress(String data) {
        System.out.println("Comprimindo dados...");
        return "dados comprimidos";
    }

    private String decompress(String data) {
        System.out.println("Descomprimindo dados...");
        return "dados descomprimidos";
    }
}