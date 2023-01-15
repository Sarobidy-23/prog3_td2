package com.example.hei.prog3_td2.controller.response;

import com.example.hei.prog3_td2.model.ScoreEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PlayAgainstResponse {
    private int id;
    private String datetime;
    private String stadium;
    private TeamMatchResponse teamA;
    private TeamMatchResponse teamB;
}
