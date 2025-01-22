package com.moouze.GameList.controllers;

import com.moouze.GameList.dto.GameDTO;
import com.moouze.GameList.dto.GameListDTO;
import com.moouze.GameList.dto.GameMinDTO;
import com.moouze.GameList.services.GameListService;
import com.moouze.GameList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }


}
