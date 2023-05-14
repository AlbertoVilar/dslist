package com.devsuperior.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.dto.GameListDTO;
import com.devsuperior.demo.dto.GameMinDTO;
import com.devsuperior.demo.entities.GameList;
import com.devsuperior.demo.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;

	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();

	}
}
