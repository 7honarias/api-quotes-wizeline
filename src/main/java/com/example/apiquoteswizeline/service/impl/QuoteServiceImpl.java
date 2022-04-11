package com.example.apiquoteswizeline.service.impl;

import com.example.apiquoteswizeline.Model.Quote;
import com.example.apiquoteswizeline.dtos.QuoteDto;
import com.example.apiquoteswizeline.repository.QuoteRepository;
import com.example.apiquoteswizeline.service.QuoteService;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final QuoteRepository quoteRepository;

    public QuoteServiceImpl(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @Override
    public QuoteDto getQuote() {
        Quote quote = quoteRepository.getQuoteToday();
        return new QuoteDto(quote.getQ(), quote.getA());
    }
}
