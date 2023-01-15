package com.example.hei.prog3_td2.controller;

import com.example.hei.prog3_td2.controller.mapper.PlayAgainstMapper;
import com.example.hei.prog3_td2.controller.mapper.ScoreMapper;
import com.example.hei.prog3_td2.controller.response.PlayAgainstResponse;
import com.example.hei.prog3_td2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService service;
    private final PlayAgainstMapper mapper;
    private final ScoreMapper scoreMapper;
    @GetMapping("/matchs")
    public List<PlayAgainstResponse> getMatchs() {
        return service.getMatchs().stream().map(mapper::toRest).toList();
    }
    @GetMapping("/matchs/{idMatch}")
    public List<PlayAgainstResponse> getMatchById(@PathVariable int idMatch) {
        return service.getMatchById(idMatch).stream().map(mapper::toRest).toList();
    }
}
