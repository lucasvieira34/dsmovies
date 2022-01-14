package com.lucasvieira.dsmovie.repositories;

import com.lucasvieira.dsmovie.entities.Score;
import com.lucasvieira.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
