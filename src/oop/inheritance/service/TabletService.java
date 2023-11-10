package oop.inheritance.service;

import oop.inheritance.domain.Tablet;
import oop.inheritance.repository.TabletRepository;

import java.util.List;

public class TabletService {

    private TabletRepository repository = new TabletRepository();

    public void create(Tablet phone) {
        repository.create(phone);
    }

    public Tablet getObjectById(Integer id) {
        return repository.getObjectById(id);
    }

    public List<Tablet> getAllTablets() {
        return repository.getAllTablets();
    }
}
