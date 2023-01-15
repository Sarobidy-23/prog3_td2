package com.example.hei.prog3_td2.service;

import com.example.hei.prog3_td2.model.PlayerEntity;
import com.example.hei.prog3_td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;
    public List<PlayerEntity> getPlayerByTeam(int idTeam) {
        return repository.getPlayersByIdTeam(idTeam);
    }
    public PlayerEntity getPlayerById(int idPlayer) {
        return repository.getPlayerById(idPlayer);
    }
}
