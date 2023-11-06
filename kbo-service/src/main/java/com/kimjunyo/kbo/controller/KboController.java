package com.kimjunyo.kbo.controller;

import com.kimjunyo.kbo.model.Kbo;
import com.kimjunyo.kbo.service.KboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "v1/kbo")
public class KboController {
    private Logger LOGGER = LoggerFactory.getLogger(KboController.class);

    @Autowired
    private KboService service;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String getHello() {
        return "Hi~";
    }

    @RequestMapping(value = "/team/{team}", method = RequestMethod.GET)
    public ResponseEntity<List<Kbo>> getKboTeam(@PathVariable("team") String team) {
        LOGGER.info(team);
        List<Kbo> result = service.findByTeamName(team);
        return ResponseEntity.ok(result);
    }

}