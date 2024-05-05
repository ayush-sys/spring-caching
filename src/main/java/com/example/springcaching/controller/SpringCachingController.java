package com.example.springcaching.controller;


import com.example.springcaching.dao.UserDao;
import com.example.springcaching.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class SpringCachingController {

    @Autowired
    private UserService service;

    @GetMapping("/test-cache")
    @Cacheable(value = "userCache", key="#id")
    public String returnValue(@RequestHeader("id") String id) throws InterruptedException {
      log.info("Started application at " + new Date());
      Thread.sleep(5000);
      log.info("Ended application at " + new Date());
      return service.getDataOfUser();
    }
}
