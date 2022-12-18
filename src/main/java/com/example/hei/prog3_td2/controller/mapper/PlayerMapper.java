package com.example.hei.prog3_td2.controller.mapper;

import com.example.hei.prog3_td2.controller.response.PlayerResponse;
import com.example.hei.prog3_td2.model.PlayerEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerMapper {
    public PlayerResponse toRest(PlayerEntity domain) {
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }
}
