package oop.inheritance.db;

import oop.inheritance.domain.Laptop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LaptopDatabase {

    private List<Laptop> laptopList = new ArrayList<>();

    public void save(Laptop product) {
        if (Objects.nonNull(product)) {
            laptopList.add(product);
        } else {
            throw new RuntimeException("Laptop can not be null");
        }
    }

    public Laptop getProductById(String id) {
        for (Laptop product : laptopList) {
            if (product.getProductId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Laptop> getProducts() {
        return laptopList;
    }
}
