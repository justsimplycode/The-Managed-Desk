package com.shaswat.userservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/userservice")
    public ResponseEntity<String> HomeController(){
        return new ResponseEntity<>("Welcome to user service", HttpStatus.OK);
    }
}
