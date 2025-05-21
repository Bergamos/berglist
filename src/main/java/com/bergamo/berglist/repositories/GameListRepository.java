package com.bergamo.berglist.repositories;

import com.bergamo.berglist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
