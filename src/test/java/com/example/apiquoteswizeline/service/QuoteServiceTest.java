package com.example.apiquoteswizeline.service;

import com.example.apiquoteswizeline.Model.Quote;
import com.example.apiquoteswizeline.dtos.QuoteDto;
import com.example.apiquoteswizeline.repository.QuoteRepository;
import com.example.apiquoteswizeline.service.impl.QuoteServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class QuoteServiceTest {

    @Mock
    QuoteRepository quoteRepository;

    @InjectMocks
    QuoteServiceImpl quoteService;


    @Test
    public void itShouldReturnTheServiceQuote() {
        Quote quote = new Quote("este es un ejemplo", "Jhon Arias", "<h1>ejemplo<h1>");
        when(quoteRepository.getQuoteToday()).thenReturn(quote);
        QuoteDto quoteDto = quoteService.getQuote();

        Assertions.assertEquals(quoteDto.getText(), "este es un ejemplo");
        Assertions.assertEquals(quoteDto.getAuthor(), "Jhon Arias");
    }

}
