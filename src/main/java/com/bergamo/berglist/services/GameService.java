package com.bergamo.berglist.services;

import com.bergamo.berglist.dto.GameMinDTO;
import com.bergamo.berglist.entities.Game;
import com.bergamo.berglist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }




}
