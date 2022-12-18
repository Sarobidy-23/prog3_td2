package com.example.hei.prog3_td2.controller;

import com.example.hei.prog3_td2.controller.mapper.TeamMapper;
import com.example.hei.prog3_td2.controller.response.TeamResponse;
import com.example.hei.prog3_td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamMapper mapper;
    @GetMapping("/teams")
    public List<TeamResponse> getTeams() {
        return service.getTeams().stream().map(mapper::toRest).toList();
    }
}
