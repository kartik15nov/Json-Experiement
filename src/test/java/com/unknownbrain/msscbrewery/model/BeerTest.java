package com.unknownbrain.msscbrewery.model;

import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@JsonTest
public class BeerTest {
    BeerDto getBeerDto() {
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(123232L)
                .build();
    }
}
