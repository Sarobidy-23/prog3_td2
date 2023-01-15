package com.example.hei.prog3_td2.controller.mapper;

import com.example.hei.prog3_td2.controller.response.PlayAgainstResponse;
import com.example.hei.prog3_td2.model.PlayAgainstEntity;
import com.example.hei.prog3_td2.model.ScoreEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PlayAgainstMapper {
    private final TeamMapper teamMapper;
    private final ScoreMapper scoreMapper;
    private final TeamMatchMapper teamMatchMapper;
    public PlayAgainstResponse toRest(PlayAgainstEntity domain) {

        return PlayAgainstResponse.builder()
                .id(domain.getId())
                .stadium(domain.getStadium())
                .datetime(domain.getDatetime().toString())
                .teamA(teamMatchMapper.toRest(domain.getTeamAscore(),domain.getTeamA()))
                .teamB(teamMatchMapper.toRest(domain.getTeamBscore(),domain.getTeamB()))
                .build();
    }
}
