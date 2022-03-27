package com.blz.stockaccountmgmt;

public class StockPortfolio {

    private  String shareName;
    private int noOfShares;
    private double sharePrice;
    private double totalSharePrice;

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public void setTotalSharePrice(double totalSharePrice) {
        this.totalSharePrice = totalSharePrice;
    }

    @Override
    public String toString() {
        return "StockPortfolio{" +
                "shareName='" + shareName + '\'' +
                ", noOfShares=" + noOfShares +
                ", sharePrice=" + sharePrice +
                ", totalSharePrice=" + totalSharePrice +
                '}';
    }
}
