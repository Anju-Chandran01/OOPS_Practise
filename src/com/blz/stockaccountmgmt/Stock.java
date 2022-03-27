package com.blz.stockaccountmgmt;

import java.util.List;
import java.util.Scanner;

public class Stock {

    List<StockPortfolio> stockList = StockList.getStocks();
    StockPortfolio stockPortfolio = new StockPortfolio();

    public void calculateStock() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of stocks: ");
        int number = sc.nextInt();
        double totalSharePrice = 0;
        double eachSharePrice;

        for (int i = 0; i < number; i++) {
            System.out.println("Enter the Share Name : ");
            stockPortfolio.setShareName(sc.next());
            System.out.println("Enter No: of Shares");
            stockPortfolio.setNoOfShares(sc.nextInt());
            System.out.println("Enter Share Price");
            stockPortfolio.setSharePrice(sc.nextDouble());

            eachSharePrice = stockPortfolio.getNoOfShares() * stockPortfolio.getSharePrice();
            stockPortfolio.setTotalSharePrice(eachSharePrice);
            stockList.add(stockPortfolio); // ADD STOCK DETAILS TO LIST
//          StockList.setStocks(eachSharePrice);
            totalSharePrice = totalSharePrice + eachSharePrice;
            System.out.println(totalSharePrice);
        }
        StockList.setTotalValue(totalSharePrice);
    }

    public void printStock() {
        for (StockPortfolio stocks : stockList) {
            System.out.println(stocks);
        }
        System.out.println("Total value of stock : " + StockList.getTotalValue());
    }
}
