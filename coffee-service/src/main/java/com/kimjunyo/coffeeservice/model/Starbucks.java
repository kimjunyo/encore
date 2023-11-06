package com.kimjunyo.coffeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Starbucks {
    @Id
    private Integer id;

    private String sName;
    private String addr;
    private String openDt;
}
