package com.example.hei.prog3_td2.controller.mapper;

import com.example.hei.prog3_td2.controller.response.ScoreResponse;
import com.example.hei.prog3_td2.controller.response.TeamMatchResponse;
import com.example.hei.prog3_td2.model.ScoreEntity;
import com.example.hei.prog3_td2.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class TeamMatchMapper {
    private final ScoreMapper scoreMapper;
    public TeamMatchResponse toRest(List<ScoreEntity> scores, TeamEntity team) {

        return TeamMatchResponse.builder()
                .id(team.getId())
                .name(team.getName())
                .goals(scores.size())
                .scores(scores.stream().map(scoreMapper::toRest).toList())
                .build();
    }
}
