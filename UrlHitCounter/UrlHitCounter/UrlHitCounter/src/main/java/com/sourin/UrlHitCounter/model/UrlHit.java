package com.sourin.UrlHitCounter.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrlHit {

    private String userName;
    private Integer hitCount;
}
