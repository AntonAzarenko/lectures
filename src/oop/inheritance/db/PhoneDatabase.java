package oop.inheritance.db;

import oop.inheritance.domain.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneDatabase {

    private List<Phone> laptopList = new ArrayList<>();

    public void save(Phone product) {
        if (Objects.nonNull(product)) {
            laptopList.add(product);
        } else {
            throw new RuntimeException("Phone can not be null");
        }
    }

    public Phone getProductById(Integer id) {
        for (Phone product : laptopList) {
            if (product.getProductId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Phone> getProducts() {
        return laptopList;
    }
}
