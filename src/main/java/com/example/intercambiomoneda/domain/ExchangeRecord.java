package com.example.intercambiomoneda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExchangeRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String fromCurrency;
    private String toCurrency;
    private double exchangedAmount;
    private double exchangeRate;

    // Constructor sin argumentos (necesario para JPA)
    protected ExchangeRecord() {
    }

    // Constructor con argumentos
    public ExchangeRecord(double amount, String fromCurrency, String toCurrency, double exchangedAmount, double exchangeRate) {
        this.amount = amount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangedAmount = exchangedAmount;
        this.exchangeRate = exchangeRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getExchangedAmount() {
        return exchangedAmount;
    }

    public void setExchangedAmount(double exchangedAmount) {
        this.exchangedAmount = exchangedAmount;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
