package org.example;

import org.example.Data.DataSource;

public class Main {
    public static void main(String[] args) {
        DataSource encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("OutputDemo.txt")
                )
        );
        encoded.writeData("Exemplo de dados");
        String result = encoded.readData();
        System.out.println("Dados lidos: " + result);
            }
        }