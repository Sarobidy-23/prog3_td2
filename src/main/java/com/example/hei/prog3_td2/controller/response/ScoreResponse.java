package com.example.hei.prog3_td2.controller.response;

import com.example.hei.prog3_td2.model.PlayerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScoreResponse {
    private int minutes;
    private boolean isOwnGoal;
    private PlayerResponse player;
}
