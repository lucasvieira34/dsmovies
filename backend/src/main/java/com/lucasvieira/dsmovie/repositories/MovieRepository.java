package com.lucasvieira.dsmovie.repositories;

import com.lucasvieira.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
