package com.example.apiquoteswizeline.dtos;

import lombok.Data;

@Data
public class QuoteDto {
    private String text;
    private String author;

    public QuoteDto(String q, String a) {
        this.text = q;
        this.author = a;
    }
}
