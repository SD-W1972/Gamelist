package com.secon.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secon.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
