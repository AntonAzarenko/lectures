package oop.inheritance;

import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {

    private DataBase dataBase = new DataBase();

    public static void main(String[] args) {
        new Main().startApplication();
    }

    private void startApplication() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Выберите действие. 1-посмотреть весть товар. 2 - найти товар, 3 - добавить товар");
        int action = scanner.nextInt();
        if (action == 1) {
            List<Product> products = dataBase.getProducts();
            System.out.println(products);
        } else if (action == 2) {
            System.out.println("введите модель");
            Product product = dataBase.getProductByModel(scanner.next());
            System.out.println(product);
        } else if (action == 3) {

            ProductCreator productCreator = new ProductCreator();
            Product product = productCreator.createProduct();
            dataBase.save(product);
        } else {
            startApplication();
        }
        startApplication();
    }
}
