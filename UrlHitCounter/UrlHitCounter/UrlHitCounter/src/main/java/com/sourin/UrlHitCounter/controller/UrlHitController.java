package com.sourin.UrlHitCounter.controller;

import com.sourin.UrlHitCounter.model.UrlHit;
import com.sourin.UrlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class UrlHitController {
    @Autowired
    UrlHitService urlHitService;
    @RequestMapping(value = "add",method = POST)
    public String addUrlHit(@RequestBody UrlHit url){
        return urlHitService.addUrlHit(url);
    }
    @GetMapping("url")
    public List<UrlHit> getUrlHit(){
        return urlHitService.getUrlHit();
    }

    @GetMapping("count/{name}")
    public int getCount(@PathVariable String name){
        return urlHitService.getCount(name);
    }
}
