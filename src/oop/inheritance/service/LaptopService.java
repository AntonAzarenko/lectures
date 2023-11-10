package oop.inheritance.service;

import oop.inheritance.domain.Laptop;
import oop.inheritance.repository.LaptopRepository;

import java.util.List;

public class LaptopService {

    private LaptopRepository repository = new LaptopRepository();

    public void create(Laptop phone) {
        repository.create(phone);
    }

    public Laptop getObjectById(String id) {
        return repository.getObjectById(id);
    }

    public List<Laptop> getAllLaptops() {
        return repository.getAllLaptops();
    }
}
