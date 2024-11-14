package com.secon.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secon.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
