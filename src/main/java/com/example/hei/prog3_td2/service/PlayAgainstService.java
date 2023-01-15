package com.example.hei.prog3_td2.service;

import com.example.hei.prog3_td2.model.PlayAgainstEntity;
import com.example.hei.prog3_td2.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayAgainstService {
    private final PlayAgainstRepository repository;
    public List<PlayAgainstEntity> getMatchs() {
        return repository.findAll();
    }
    public List<PlayAgainstEntity> getMatchById(int idMatch) {
        return repository.getByIdMatch(idMatch);
    }

}
