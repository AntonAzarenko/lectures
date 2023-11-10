package oop.inheritance.controller;

import oop.inheritance.domain.*;
import oop.inheritance.service.*;

public class DistributorCallController {

    private ProductCreatorService productCreatorService = new ProductCreatorService();
    private LaptopService laptopService = new LaptopService();
    private PhoneService phoneService = new PhoneService();
    private TabletService tabletService = new TabletService();
    private ProductService productService = new ProductService(laptopService, phoneService, tabletService);

    public void doAction(ActionType action) {
        switch (action) {
            case ADD:
                addProduct();
                break;
            case SHOW_ALL:
                productService.showAllProducts();
                break;
            case FIND_BY_ID:
                break;
            default:
                break;
        }
    }

    private void addProduct() {
        Product<?> product = productCreatorService.createProduct();
        Type type = product.getType();
        switch (type) {
            case PHONE:
                phoneService.create((Phone) product);
                break;
            case LAPTOP:
                laptopService.create((Laptop) product);
                break;
            case TABLET:
                tabletService.create((Tablet) product);
                break;
        }
    }
}
