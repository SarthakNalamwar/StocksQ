package com.api.stocksQ.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StocksQts {

    @JsonProperty("01. symbol")
    private String symbol;

    @JsonProperty("02. open")
    private double openingPrice;

    @JsonProperty("03. high")
    private double highestPrice;

    @JsonProperty("04. low")
    private double lowestPrice;

    @JsonProperty("05. price")
    private double currentPrice;

    @JsonProperty("06. volume")
    private long tradingVolume;

    @JsonProperty("07. latest trading day")
    private String lastTradingDay;

    @JsonProperty("08. previous close")
    private double previousClosingPrice;

    @JsonProperty("09. change")
    private double priceChange;

    @JsonProperty("10. change percent")
    private String percentageChange;

    // Getters and Setters
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(double openingPrice) {
        this.openingPrice = openingPrice;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(double highestPrice) {
        this.highestPrice = highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public long getTradingVolume() {
        return tradingVolume;
    }

    public void setTradingVolume(long tradingVolume) {
        this.tradingVolume = tradingVolume;
    }

    public String getLastTradingDay() {
        return lastTradingDay;
    }

    public void setLastTradingDay(String lastTradingDay) {
        this.lastTradingDay = lastTradingDay;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getPriceChange() {
        return priceChange;
    }

    public void setPriceChange(double priceChange) {
        this.priceChange = priceChange;
    }

    public String getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(String percentageChange) {
        this.percentageChange = percentageChange;
    }
}
