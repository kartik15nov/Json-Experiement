package com.unknownbrain.msscbrewery.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("snake")
@JsonTest
public class BeerDtoSnakeTest extends BeerTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeBeerDto() throws JsonProcessingException {
        BeerDto beerDto = getBeerDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String jsonString = "{\"id\":\"b6e142e2-2c16-446c-8784-5a24a10e754c\",\"version\":null,\"createdDate\":\"2020-08-12T01:52:03.9235821+05:30\",\"lastModifiedDate\":\"2020-08-12T01:52:03.9235821+05:30\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123232,\"price\":12.99,\"quantityOnHand\":null}\n";

        BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);

        System.out.println(beerDto);
    }
}
