package com.moouze.GameList.services;

import com.moouze.GameList.dto.GameListDTO;
import com.moouze.GameList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       return gameListRepository.findAll().stream().map(GameListDTO::new).collect(Collectors.toList());
    }

}
