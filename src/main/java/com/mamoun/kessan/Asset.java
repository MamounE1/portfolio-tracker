package com.mamoun.kessan;

import java.math.BigDecimal;

public record Asset(
        Long id,
        String symbol,
        String name,
        Double quantity,
        BigDecimal purchasePrice
) {}