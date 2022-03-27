package com.blz.stockaccountmgmt;

import java.util.ArrayList;
import java.util.List;

public class StockList {

    private static List<StockPortfolio> stocks = new ArrayList<StockPortfolio>();
    private static double totalSharePrice;

    public static List<StockPortfolio> getStocks() {
        return stocks;
    }

    public static void setStocks(List<StockPortfolio> stocks) {
        StockList.stocks = stocks;
    }

    public static double getTotalValue() {
        return totalSharePrice;
    }

    public static void setTotalValue(double totalSharePrice) {
        StockList.totalSharePrice = totalSharePrice;
    }
}
