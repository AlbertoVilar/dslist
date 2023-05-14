package com.devsuperior.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.dto.GameMinDTO;
import com.devsuperior.demo.entities.Game;
import com.devsuperior.demo.repositories.GameRepository;

@Service
public class GameService {

@Autowired
private GameRepository gameRepository;
	
public List<GameMinDTO> findAll(){
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> resultDTO = result.stream().map(x -> new GameMinDTO(x)).toList();
	return resultDTO;
	
}
}
