package oop.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataBase {

    private List<Product> products = new ArrayList<>();

    public void save(Product product) {
        if (Objects.nonNull(product)) {
            products.add(product);
        } else {
            throw new RuntimeException("Phone can not be null");
        }
    }

    public Product getProductByModel(String model) {
        for(Product product: products) {
            if(product.getModel().equals(model)){
                return product;
            }
        }
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
}
