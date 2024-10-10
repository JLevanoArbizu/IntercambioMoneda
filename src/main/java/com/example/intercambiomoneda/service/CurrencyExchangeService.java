package com.example.intercambiomoneda.service;

import com.example.intercambiomoneda.client.ExchangeRateClient;
import com.example.intercambiomoneda.domain.ExchangeRecord;
import com.example.intercambiomoneda.dto.ExchangeResponse;
import com.example.intercambiomoneda.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    private final ExchangeRateClient exchangeRateClient;
    private final ExchangeRateRepository exchangeRateRepository;

    @Autowired
    public CurrencyExchangeService(ExchangeRateClient exchangeRateClient, ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateClient = exchangeRateClient;
        this.exchangeRateRepository = exchangeRateRepository;
    }

    public ExchangeResponse applyExchangeRate(double amount, String fromCurrency, String toCurrency) {
        var response = exchangeRateClient.getExchangeRate(fromCurrency);
        Double rate = response.getRates().get(toCurrency);

        if (rate == null) {
            throw new IllegalArgumentException("Currency not supported: " + toCurrency);
        }

        double convertedAmount = amount * rate;
        var record = new ExchangeRecord(amount, fromCurrency, toCurrency, convertedAmount, rate);
        exchangeRateRepository.save(record);

        return new ExchangeResponse(amount, convertedAmount, fromCurrency, toCurrency, rate);
    }
}
