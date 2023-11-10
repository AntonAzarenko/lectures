package oop.inheritance.db;

import oop.inheritance.domain.Tablet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TabletDatabase {

    private List<Tablet> tabletList = new ArrayList<>();

    public void save(Tablet laptop) {
        if (Objects.nonNull(laptop)) {
            tabletList.add(laptop);
        } else {
            throw new RuntimeException("Tablet can not be null");
        }
    }

    public Tablet getProductById(Integer id) {
        for (Tablet product : tabletList) {
            if (product.getProductId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Tablet> getProducts() {
        return tabletList;
    }
}
