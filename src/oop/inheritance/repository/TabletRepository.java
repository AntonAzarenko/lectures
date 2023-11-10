package oop.inheritance.repository;

import oop.inheritance.db.TabletDatabase;
import oop.inheritance.domain.Tablet;

import java.util.List;

public class TabletRepository implements Dao<Tablet> {

    private TabletDatabase database = new TabletDatabase();

    @Override
    public void create(Tablet tablet) {
        database.save(tablet);
    }

    @Override
    public void delete(Tablet type) {

    }

    public Tablet getObjectById(Integer id) {
        return database.getProductById(id);
    }

    public List<Tablet> getAllTablets() {
        return database.getProducts();
    }
}
