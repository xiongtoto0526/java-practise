package com.xht.myseed.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);


    @RequestMapping(value = "/apis/test/first", method = RequestMethod.GET)
    public ResponseEntity<?> testFirstApi() {
        logger.info("begin testFirstApi...");
        return ResponseEntity.ok("success");
    }


}
