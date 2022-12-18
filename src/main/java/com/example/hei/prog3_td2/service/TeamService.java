package com.example.hei.prog3_td2.service;

import com.example.hei.prog3_td2.model.TeamEntity;
import com.example.hei.prog3_td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<TeamEntity> getTeams() {
        return repository.findAll();
    }
    public List<TeamEntity> saveTeams(List<TeamEntity> toSaved) {
        return repository.saveAll(toSaved);
    }
}
