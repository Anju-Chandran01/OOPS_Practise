package com.blz.stockaccountmgmt;

public class Main {

    void userSelection(int choice){

        Stock stock = new Stock();
        switch (choice) {
            case 1 -> stock.calculateStock();
            case 2 -> stock.printStock();
            case 3 -> System.out.println("Exited from Stock Account Management program");
            default -> System.out.println("Enter valid choice between 1 to 3");
        }
    }

    public static void main(String[] args) {

        System.out.println("--- Welcome to Stock Account Management ---");

        UserInterface userInterface = new UserInterface();
        Main main = new Main();

        int option;
        do {
            option = userInterface.showMainMenu();
            main.userSelection(option);
        } while (option != 3);
    }
}
