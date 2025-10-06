package com.swagger.practice.service;

import com.swagger.practice.model.dto.MatchDto;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {
    @Override
    public MatchDto getAllMatches() {
        MatchDto dto = new MatchDto();

        dto.setClub("Real");
        return dto;
    }
}
