package com.api.stocksQ.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GlobalQuoteResponse {

    @JsonProperty("Global Quote")
    private StocksQts globalQuote;

    public StocksQts getGlobalQuote() {
        return globalQuote;
    }

    public void setGlobalQuote(StocksQts globalQuote) {
        this.globalQuote = globalQuote;
    }
}

