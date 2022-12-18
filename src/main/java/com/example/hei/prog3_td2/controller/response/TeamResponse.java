package com.example.hei.prog3_td2.controller.response;

import com.example.hei.prog3_td2.model.PlayerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TeamResponse {
    private String name;
    private List<PlayerEntity> players;
}
