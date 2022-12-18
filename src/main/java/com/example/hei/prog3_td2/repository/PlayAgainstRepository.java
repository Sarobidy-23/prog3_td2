package com.example.hei.prog3_td2.repository;

import com.example.hei.prog3_td2.model.PlayAgainstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayAgainstRepository extends JpaRepository<PlayAgainstEntity, Integer> {
}
