package oop.inheritance.service;

import oop.inheritance.domain.Phone;
import oop.inheritance.repository.PhoneRepository;

import java.util.List;

public class PhoneService {

    private PhoneRepository repository = new PhoneRepository();

    public void create(Phone phone) {
        repository.create(phone);
    }

    public Phone getObjectById(Integer id) {
        return repository.getObjectById(id);
    }

    public List<Phone> getAllPhones() {
        return repository.getAllPhones();
    }
}
