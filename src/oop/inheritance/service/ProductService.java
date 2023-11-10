package oop.inheritance.service;

import oop.inheritance.domain.Laptop;
import oop.inheritance.domain.Phone;
import oop.inheritance.domain.Product;
import oop.inheritance.domain.Tablet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductService {

    private LaptopService laptopService;
    private PhoneService phoneService;
    private TabletService tabletService;

    public ProductService(LaptopService laptopService, PhoneService phoneService, TabletService tabletService) {
        this.laptopService = laptopService;
        this.phoneService = phoneService;
        this.tabletService = tabletService;
    }

    public void showAllProducts() {
        ConsoleTextWriter.writeMessage("All products.....");
        List<Product> allProducts = new ArrayList<>();
        List<Laptop> allLaptops = laptopService.getAllLaptops();
        List<Phone> allPhones = phoneService.getAllPhones();
        List<Tablet> allTablets = tabletService.getAllTablets();
        allProducts.addAll(allLaptops);
        allProducts.addAll(allPhones);
        allProducts.addAll(allTablets);
        List<Product> products = Stream.concat(
                Stream.concat(laptopService.getAllLaptops().stream(), tabletService.getAllTablets().stream()),
                phoneService.getAllPhones().stream())
                .collect(Collectors.toList());
        Map<String, Product> modelToProductMap = Stream.concat(
                Stream.concat(laptopService.getAllLaptops().stream(), tabletService.getAllTablets().stream()),
                phoneService.getAllPhones().stream())
                .collect(Collectors.toMap(element -> element.getModel(), e -> e));
        ConsoleTextWriter.writeMessage(allProducts);
    }
}
