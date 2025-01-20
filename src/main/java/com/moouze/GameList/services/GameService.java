package com.moouze.GameList.services;

import com.moouze.GameList.dto.GameMinDTO;
import com.moouze.GameList.entities.Game;
import com.moouze.GameList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
         return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
