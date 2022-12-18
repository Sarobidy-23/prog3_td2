package com.example.hei.prog3_td2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "team")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "team")
    @JsonIgnore
    private List<PlayerEntity> players;
    @ManyToMany(mappedBy = "teams")
    private List<SponsorEntity> sponsors;
    @OneToMany
    @JoinColumn(name = "id")
    private List<PlayerEntity> opponent_team;
    @OneToMany
    @JoinColumn(name = "id")
    private List<PlayerEntity> adversary_team;
}
