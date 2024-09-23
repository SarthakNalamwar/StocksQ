package com.api.stocksQ.controller;

import com.api.stocksQ.model.StocksQts;
import com.api.stocksQ.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StocksQtsController {

    private final StockService stocksService;

    @Autowired
    public StocksQtsController(StockService stocksService) {
        this.stocksService = stocksService;
    }

    // Retrieve a stock quote by its symbol
    @GetMapping("/quote/{symbol}")
    public StocksQts fetchQuoteBySymbol(@PathVariable String symbol) {
        return stocksService.fetchQuoteBySymbol(symbol);
    }

    // Retrieve stock quotes for multiple symbols
    @GetMapping("/batch-quotes")
    public List<StocksQts> fetchBatchQuotes(@RequestParam List<String> symbols) {
        return stocksService.fetchBatchQuotes(symbols);
    }


}
