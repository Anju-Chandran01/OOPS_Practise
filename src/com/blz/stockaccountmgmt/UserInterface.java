package com.blz.stockaccountmgmt;

import java.util.Scanner;

public class UserInterface {

    int showMainMenu() {

        System.out.println("Select required option");
        System.out.println("   1. Add Stock \n   2. Print Stock \n   3. Exit \n");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
