package com.moouze.GameList.repositories;

import com.moouze.GameList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {
}
