package com.sourin.UrlHitCounter.beanfactory;

import com.sourin.UrlHitCounter.model.UrlHit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UrlHitBeanList {
    @Bean

    public List<UrlHit> getList(){
        return new ArrayList<>();
    }


}
