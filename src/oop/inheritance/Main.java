package oop.inheritance;

import oop.inheritance.controller.DistributorCallController;
import oop.inheritance.domain.ActionType;
import oop.inheritance.service.ConsoleTextWriter;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    private DistributorCallController callController = new DistributorCallController();

    public static void main(String[] args) {
        new Main().startApplication();
    }

    private void startApplication() {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        ConsoleTextWriter.writeMessage("Выберите действие. 1 - посмотреть весть товар. 2 - найти товар, 3 - добавить товар");
        int action = scanner.nextInt();
        ActionType[] actionTypes = ActionType.values();
        callController.doAction(actionTypes[action - 1]);
        startApplication();
    }
}
