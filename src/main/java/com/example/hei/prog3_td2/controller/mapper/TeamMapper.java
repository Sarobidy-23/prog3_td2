package com.example.hei.prog3_td2.controller.mapper;

import com.example.hei.prog3_td2.controller.response.TeamResponse;
import com.example.hei.prog3_td2.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class TeamMapper {
    public TeamResponse toRest(TeamEntity domain) {
        return TeamResponse.builder()
                .name(domain.getName())
                .players(domain.getPlayers())
                .build();
    }

}
