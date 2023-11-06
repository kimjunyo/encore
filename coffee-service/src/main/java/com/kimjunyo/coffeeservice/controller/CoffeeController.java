package com.kimjunyo.coffeeservice.controller;

import com.kimjunyo.coffeeservice.model.Starbucks;
import com.kimjunyo.coffeeservice.service.CoffeeService;
import org.hibernate.tool.schema.spi.ScriptTargetOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v2/starbucks")
public class CoffeeController {

    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping("/addresses/{addr}/{addr2}")
    public ResponseEntity<List<Starbucks>> getStarbucksAddress(@PathVariable String addr, @PathVariable String addr2) {
        return ResponseEntity.status(HttpStatus.OK).body(coffeeService.getListAddr(addr, addr2));
    }
}
