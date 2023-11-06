package com.kimjunyo.coffeeservice.service;

import com.kimjunyo.coffeeservice.model.Starbucks;
import com.kimjunyo.coffeeservice.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    @Autowired
    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Starbucks> getListAddr(String addr, String addr2){
        return coffeeRepository.findAllByAddrContainingOrAddrContaining(addr, addr2);
    }
}
