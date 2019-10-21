package com.pangci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class Controller {

    @Autowired
    private DataSource dataSource;

    @GetMapping
    public String hello(){
        return "hellospring boot !" + dataSource;
    }
}
