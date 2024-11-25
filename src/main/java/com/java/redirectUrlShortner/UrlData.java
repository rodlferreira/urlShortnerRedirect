package com.java.redirectUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UrlData {
    // Getters e Setters
    private String originalUrl;
    private long expirationTimeInSeconds;
}
