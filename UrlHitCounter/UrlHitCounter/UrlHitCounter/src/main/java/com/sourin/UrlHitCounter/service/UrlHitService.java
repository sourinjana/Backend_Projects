package com.sourin.UrlHitCounter.service;

import com.sourin.UrlHitCounter.model.UrlHit;
import com.sourin.UrlHitCounter.repository.UrlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {
    @Autowired
    UrlRepo urlRepo;

    public String addUrlHit(UrlHit url) {
        List<UrlHit> orginalList=getUrlHit();
        orginalList.add(url);

        return "add done";
    }

    public List<UrlHit> getUrlHit() {
        return urlRepo.getUrlHitList();
    }

    public int getCount(String name) {
        List<UrlHit> orginalList=getUrlHit();
        for(UrlHit u:orginalList){
            if(u.getUserName().equals(name)){
                return u.getHitCount();
            }
        }

        return -1;
    }
}
