package com.bergamo.berglist.services;

import com.bergamo.berglist.dto.GameListDTO;
import com.bergamo.berglist.entities.GameList;
import com.bergamo.berglist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id) {
        GameList result = gameListRepository.findById(id).get();
        return new GameListDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();

    }






}
