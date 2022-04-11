package com.example.apiquoteswizeline.repository.impl;

import com.example.apiquoteswizeline.Model.Quote;
import com.example.apiquoteswizeline.repository.QuoteRepository;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class QuoteRepositoryImpl implements QuoteRepository {

    private final WebClient webClient;
    ObjectMapper mapper = new ObjectMapper();

    public QuoteRepositoryImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Quote getQuoteToday() {
        Mono<Object[]> responseFromApi = webClient.get()
                .uri("https://zenquotes.io/api/today")
                .retrieve()
                .bodyToMono(Object[].class);

        List<Quote> quotes = Arrays.stream(Objects.requireNonNull(responseFromApi.block()))
                .map(object -> mapper.convertValue(object, Quote.class))
                .collect(Collectors.toList());
        System.out.println(quotes.get(0));
        return quotes.get(0);
    }
}
