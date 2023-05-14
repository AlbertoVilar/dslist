package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {

	}

	public GameMinDTO(Game entitie) {
		this.id = entitie.getId();
		this.title = entitie.getTitle();
		this.year = entitie.getYear();
		this.imgUrl = entitie.getImgUrl();
		this.shortDescription = entitie.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
