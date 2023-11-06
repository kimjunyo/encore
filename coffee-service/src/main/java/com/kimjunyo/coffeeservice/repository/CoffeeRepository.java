package com.kimjunyo.coffeeservice.repository;

import com.kimjunyo.coffeeservice.model.Starbucks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoffeeRepository extends JpaRepository<Starbucks, Integer> {
    List<Starbucks> findAllByAddrContainingOrAddrContaining(String addr, String addr2);
}
