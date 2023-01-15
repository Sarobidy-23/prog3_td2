package com.example.hei.prog3_td2.controller.mapper;

import com.example.hei.prog3_td2.controller.response.ScoreResponse;
import com.example.hei.prog3_td2.model.ScoreEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ScoreMapper {
    private final PlayerMapper playerMapper;
    public ScoreResponse toRest(ScoreEntity domain) {
        return ScoreResponse.builder()
                .player(playerMapper.toRest(domain.getPlayer()))
                .isOwnGoal(domain.isOwnGoal())
                .minutes(domain.getTime())
                .build();
    }
}
