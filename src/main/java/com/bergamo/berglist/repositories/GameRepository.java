package com.bergamo.berglist.repositories;

import com.bergamo.berglist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
