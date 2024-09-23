package com.api.stocksQ.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BatchQuoteResponse {

    @JsonProperty("Stock Quotes")
    private List<StocksQts> stockQuotes;

    public List<StocksQts> getStockQuotes() {
        return stockQuotes;
    }

    public void setStockQuotes(List<StocksQts> stockQuotes) {
        this.stockQuotes = stockQuotes;
    }
}
