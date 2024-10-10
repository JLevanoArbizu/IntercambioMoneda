package com.example.intercambiomoneda.controller;

import com.example.intercambiomoneda.dto.ExchangeRequest;
import com.example.intercambiomoneda.dto.ExchangeResponse;
import com.example.intercambiomoneda.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exchange")
public class CurrencyExchangeController {

    private final CurrencyExchangeService currencyExchangeService;

    @Autowired
    public CurrencyExchangeController(CurrencyExchangeService currencyExchangeService) {
        this.currencyExchangeService = currencyExchangeService;
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ExchangeResponse exchangeCurrency(@RequestBody ExchangeRequest request) {
        return currencyExchangeService.applyExchangeRate(request.getAmount(), request.getFromCurrency(), request.getToCurrency());
    }
}

