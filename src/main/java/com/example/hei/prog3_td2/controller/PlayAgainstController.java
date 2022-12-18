package com.example.hei.prog3_td2.controller;

import com.example.hei.prog3_td2.controller.mapper.PlayAgainstMapper;
import com.example.hei.prog3_td2.controller.response.PlayAgainstResponse;
import com.example.hei.prog3_td2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayAgainstController {
    private final PlayAgainstService service;
    private final PlayAgainstMapper mapper;
    @GetMapping("/matchs")
    public List<PlayAgainstResponse> getMatchs() {
        return service.getMatchs().stream().map(mapper::toRest).toList();
    }
}
