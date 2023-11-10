package oop.inheritance.repository;

import oop.inheritance.db.LaptopDatabase;
import oop.inheritance.domain.Laptop;

import java.util.List;

public class LaptopRepository implements Dao<Laptop> {

    LaptopDatabase database = new LaptopDatabase();

    @Override
    public void create(Laptop laptop) {
        database.save(laptop);
    }

    @Override
    public void delete(Laptop type) {

    }

    public Laptop getObjectById(String id) {
        return database.getProductById(id);
    }

    public List<Laptop> getAllLaptops() {
        return database.getProducts();
    }
}
