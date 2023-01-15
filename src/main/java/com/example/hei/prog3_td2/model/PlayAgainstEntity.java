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

import java.time.LocalDateTime;
import java.util.ArrayList;
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
    private int id;
    private LocalDateTime datetime;
    private String stadium;
    private Integer id_teamA;
    @ManyToOne
    @JoinColumn(name = "id_teamA", insertable = false, updatable = false, nullable = true)
    @JsonIgnore
    private TeamEntity teamA;
    private Integer id_teamB;
    @ManyToOne
    @JoinColumn(name = "id_teamB", insertable = false, updatable = false, nullable = true)
    @JsonIgnore
    private TeamEntity teamB;
    @OneToMany
    @JoinColumn(name = "id")
    private List<ScoreEntity> scores;

    public List<ScoreEntity> getTeamAscore(){
        List<ScoreEntity> teamAScore = new ArrayList<>();
        for (ScoreEntity score: scores) {
            if(score.getPlayer().getId_team() == id_teamA && score.isOwnGoal() ==false ||
                    score.getPlayer().getId_team() == id_teamB && score.isOwnGoal() ==true) {
                teamAScore.add(score);
            }
        }
        return teamAScore;
    }

    public List<ScoreEntity> getTeamBscore(){
        List<ScoreEntity> teamBScore = new ArrayList<>();
        for (ScoreEntity score: scores) {
            if(score.getPlayer().getId_team() == id_teamB && score.isOwnGoal() ==false ||
                    score.getPlayer().getId_team() == id_teamA && score.isOwnGoal() ==true) {
                teamBScore.add(score);
            }
        }
        return teamBScore;
    }
}
