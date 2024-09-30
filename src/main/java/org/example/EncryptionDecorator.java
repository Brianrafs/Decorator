package org.example;

import org.example.Data.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptedData = encode(data);
        super.writeData(encryptedData);
    }

    @Override
    public String readData() {
        String data = super.readData();
        return decode(data);
    }

    private String encode(String data) {
        System.out.println("Encriptando dados...");
        return "dados encriptados";
    }

    private String decode(String data) {
        System.out.println("Descriptografando dados...");
        return "dados descriptografados";
    }
}