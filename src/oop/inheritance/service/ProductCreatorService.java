package oop.inheritance.service;

import oop.inheritance.domain.*;

import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

public class ProductCreatorService {

    private final Scanner scanner = new Scanner(new InputStreamReader(System.in));

    public Product<?> createProduct() {
        Product<?> result = null;
        System.out.println("введите тип");
        String type = scanner.next();
        if (type.equalsIgnoreCase(Type.LAPTOP.name())) {
            result = createLaptop();
        } else if (type.equalsIgnoreCase(Type.PHONE.name())) {
            result = createPhone();
        } else if (type.equalsIgnoreCase(Type.TABLET.name())) {
            result = createTablet();
        } else {
            System.out.println("нету такого типа");
        }
        return result;
    }

    private Product<Integer> createTablet() {
        Tablet tablet = new Tablet();
        fillingProduct(Type.TABLET, tablet);
        return tablet;
    }

    private Product<Integer> createPhone() {
        Phone phone = new Phone();
        fillingProduct(Type.PHONE, phone);
        System.out.println("введите тв плеер");
        phone.setTvPlayer(scanner.next());
        return phone;
    }

    private Product<String> createLaptop() {
        Laptop laptop = new Laptop();
        fillingProduct(Type.LAPTOP, laptop);
        return laptop;
    }

    private void fillingProduct(Type type, Product<?> product) {
        String model;
        BigDecimal cost;
        String vendor;
        String color;
        double displaySize;
        double weight;
        int chargeCapacitor;
        System.out.println("введите модель");
        model = scanner.next();
        System.out.println("введите цену");
        cost = scanner.nextBigDecimal();
        System.out.println("введите производитель");
        vendor = scanner.next();
        System.out.println("введите цвет");
        color = scanner.next();
        System.out.println("введите размер дисплея");
        displaySize = scanner.nextDouble();
        System.out.println("введите вес");
        weight = scanner.nextDouble();
        System.out.println("введите емкость аккумулятора");
        chargeCapacitor = scanner.nextInt();
        product.setType(type);
        product.setModel(model);
        product.setCost(cost);
        product.setColor(color);
        product.setVendor(vendor);
        product.setDisplaySize(displaySize);
        product.setWeight(weight);
        product.setChargeCapacitor(chargeCapacitor);
    }
}
