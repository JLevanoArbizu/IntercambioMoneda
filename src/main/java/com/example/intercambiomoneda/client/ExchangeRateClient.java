package com.example.intercambiomoneda.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "exchangeRateClient", url = "https://open.er-api.com/v6/latest")
public interface ExchangeRateClient {
    @GetMapping("/{currency}")
    ExchangeRateResponse getExchangeRate(@PathVariable("currency") String currency);
}
