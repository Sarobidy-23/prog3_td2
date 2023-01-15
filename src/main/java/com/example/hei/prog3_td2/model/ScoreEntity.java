package com.example.hei.prog3_td2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "score")
public class ScoreEntity {
    @Id
    private int id;
    private int time;
    @Column(name = "is_own_goal")
    private boolean isOwnGoal;
    private Integer id_play_against;
    private Integer id_player;
    @ManyToOne
    @JoinColumn(name = "id_player", insertable = false,updatable = false)
    @JsonIgnore
    private PlayerEntity player;
    @ManyToOne
    @JoinColumn(name = "id_play_against", insertable = false, updatable = false)
    @JsonIgnore
    private PlayAgainstEntity playAgainst;
}
