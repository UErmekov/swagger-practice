package com.swagger.practice.controller;

import com.swagger.practice.model.dto.MatchDto;
import com.swagger.practice.service.MatchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/match")
public class MatchController {

    private final MatchService service;

    public MatchController(MatchService service) {
        this.service = service;
    }

    @GetMapping
    public MatchDto getAllMatches() {
        return service.getAllMatches();
    }
}
