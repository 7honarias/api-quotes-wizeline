package com.example.apiquoteswizeline.Model;

import lombok.Data;

@Data
public class Quote {
    private String q;
    private String a;
    private String h;

    public Quote(String q, String a, String h) {
        this.q = q;
        this.a = a;
        this.h = h;
    }
}
