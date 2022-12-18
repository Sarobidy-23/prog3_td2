package com.example.hei.prog3_td2.controller.mapper;

import com.example.hei.prog3_td2.controller.response.PlayAgainstResponse;
import com.example.hei.prog3_td2.model.PlayAgainstEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayAgainstMapper {
    public PlayAgainstResponse toRest(PlayAgainstEntity domain) {
        return PlayAgainstResponse.builder()
                .id(domain.getId())
                .date(domain.getDatetime().toString().substring(0,10))
                .time(domain.getDatetime().toString().substring(11))
                .build();
    }
}
