package oop.inheritance.repository;

import oop.inheritance.db.PhoneDatabase;
import oop.inheritance.domain.Phone;

import java.util.List;

public class PhoneRepository implements Dao<Phone> {

    private PhoneDatabase database = new PhoneDatabase();

    @Override
    public void create(Phone type) {
        database.save(type);
    }

    @Override
    public void delete(Phone type) {

    }

    public Phone getObjectById(Integer id) {
        return database.getProductById(id);
    }

    public List<Phone> getAllPhones() {
        return database.getProducts();
    }
}
