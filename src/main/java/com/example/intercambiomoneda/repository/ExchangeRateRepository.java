package com.example.intercambiomoneda.repository;

import com.example.intercambiomoneda.domain.ExchangeRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRecord, Long> {
}
