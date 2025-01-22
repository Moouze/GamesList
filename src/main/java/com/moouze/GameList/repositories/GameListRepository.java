package com.moouze.GameList.repositories;

import com.moouze.GameList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {
}
