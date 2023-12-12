package com.sourin.UrlHitCounter.repository;

import com.sourin.UrlHitCounter.model.UrlHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlRepo {
     @Autowired
    private List<UrlHit> urlHitList;

    public List<UrlHit> getUrlHitList(){
        return urlHitList;
    }
}
