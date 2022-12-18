package com.example.hei.prog3_td2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "play_against")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayAgainstEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime datetime;
    private String stadium;
    private Long id_opponent_team;
    @ManyToOne
    @JoinColumn(name = "id_opponent_team", insertable = false, updatable = false, nullable = true)
    @JsonIgnore
    private TeamEntity opponentTeam;
    private Long id_adversary_team;
    @ManyToOne
    @JoinColumn(name = "id_adversary_team", insertable = false, updatable = false, nullable = true)
    @JsonIgnore
    private TeamEntity adversaryTeam;
}
