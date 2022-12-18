package com.example.hei.prog3_td2.controller.mapper;

import com.example.hei.prog3_td2.controller.response.PlayAgainstResponse;
import com.example.hei.prog3_td2.controller.response.TeamResponse;
import com.example.hei.prog3_td2.model.PlayAgainstEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class PlayAgainstMapper {
    private final TeamMapper teamMapper;
    public PlayAgainstResponse toRest(PlayAgainstEntity domain) {
        List<TeamResponse> comptetitor = new ArrayList<>();
            comptetitor.add(teamMapper.toRest(domain.getOpponentTeam()));
            comptetitor.add(teamMapper.toRest(domain.getAdversaryTeam()));
        return PlayAgainstResponse.builder()
                .id(domain.getId())
                .date(domain.getDatetime().toString().substring(0,10))
                .time(domain.getDatetime().toString().substring(11))
                .competitor(comptetitor)
                .build();
    }
}
