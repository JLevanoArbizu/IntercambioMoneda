package com.example.intercambiomoneda.dto;

public class ExchangeResponse {
    private double amount;
    private double exchangedAmount;
    private String fromCurrency;
    private String toCurrency;
    private double exchangeRate;

    public ExchangeResponse(double amount, double exchangedAmount, String fromCurrency, String toCurrency, double exchangeRate) {
        this.amount = amount;
        this.exchangedAmount = exchangedAmount;
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.exchangeRate = exchangeRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getExchangedAmount() {
        return exchangedAmount;
    }

    public void setExchangedAmount(double exchangedAmount) {
        this.exchangedAmount = exchangedAmount;
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

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
