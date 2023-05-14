package com.devsuperior.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.dto.GameDTO;
import com.devsuperior.demo.dto.GameMinDTO;
import com.devsuperior.demo.entities.Game;
import com.devsuperior.demo.repositories.GameRepository;

import jakarta.transaction.Transactional;

@Service
public class GameService {

@Autowired
private GameRepository gameRepository;

@org.springframework.transaction.annotation.Transactional(readOnly = true)
public GameDTO findById(Long id) {
	Game reuslt = gameRepository.findById(id).get();
	GameDTO dto = new GameDTO(reuslt);
	return dto;
}
	
public List<GameMinDTO> findAll(){
	List<Game> result = gameRepository.findAll();
	List<GameMinDTO> resultDTO = result.stream().map(x -> new GameMinDTO(x)).toList();
	return resultDTO;
	
}
}
