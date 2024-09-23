package com.api.stocksQ.services;

import com.api.stocksQ.model.BatchQuoteResponse;
import com.api.stocksQ.model.GlobalQuoteResponse;
import com.api.stocksQ.model.StocksQts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {

    private final WebClient webClient;

    @Value("${alphavantage.api.key}")
    private String apiKey;

    public StockService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://www.alphavantage.co").build();
    }

    // Retrieve Quote by Symbol
    public StocksQts fetchQuoteBySymbol(String symbol) {
        try {
            GlobalQuoteResponse response = webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/query")
                            .queryParam("function", "GLOBAL_QUOTE")
                            .queryParam("symbol", symbol)
                            .queryParam("apikey", apiKey)
                            .build())
                    .retrieve()
                    .bodyToMono(GlobalQuoteResponse.class)
                    .block();

            if (response != null) {
                return response.getGlobalQuote();
            } else {
                throw new RuntimeException("No data returned for the symbol: " + symbol);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error fetching stock data: " + e.getMessage(), e);
        }
    }

    // Retrieve Batch Quotes for Multiple Symbols
    public List<StocksQts> fetchBatchQuotes(List<String> symbols) {
        return symbols.stream()
                .map(this::fetchQuoteBySymbol)
                .collect(Collectors.toList());
    }

    // Retrieve Historical Options Data by Symbol and Date

}
