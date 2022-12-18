package com.example.hei.prog3_td2.repository;

import com.example.hei.prog3_td2.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
    @Query(value = "select * from player where id_team= :id_team", nativeQuery = true)
    List<PlayerEntity> getPlayersByIdTeam(@Param("id_team")Long idTeam);
}
