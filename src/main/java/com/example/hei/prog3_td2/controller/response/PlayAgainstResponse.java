package com.example.hei.prog3_td2.controller.response;

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
    private Long id;
    private String date;
    private String time;
    private List<TeamResponse> competitor;
}
