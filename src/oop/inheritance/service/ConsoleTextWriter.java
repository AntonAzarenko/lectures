package oop.inheritance.service;

import oop.inheritance.domain.Product;

import java.util.List;

public class ConsoleTextWriter {

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static void writeMessage(List<Product> products) {
        System.out.println(products);
    }
}
