package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {
		// TODO Auto-generated constructor stub
	}

	public GameListDTO(GameList entity) {
		
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
