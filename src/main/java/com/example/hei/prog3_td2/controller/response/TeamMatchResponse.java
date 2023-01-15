package com.example.hei.prog3_td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamMatchResponse {
    private int id;
    private String name;
    private int goals;
    private List<ScoreResponse> scores;
}
