package com.example.hei.prog3_td2.repository;

import com.example.hei.prog3_td2.model.PlayAgainstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayAgainstRepository extends JpaRepository<PlayAgainstEntity, Integer> {
    @Query(value = "select * from play_against where id= :idMatch", nativeQuery = true)
    List<PlayAgainstEntity> getByIdMatch(@Param("idMatch")int idMatch);
}
