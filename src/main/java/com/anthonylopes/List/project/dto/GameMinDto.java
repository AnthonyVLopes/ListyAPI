package com.anthonylopes.List.project.dto;

import jakarta.persistence.Column;

public class GameMinDto {

    private long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

   public GameMinDto (){}

    public GameMinDto(long id, String title, int year, String imgUrl, String shortDescription){

       this.id = id;
       this.title = title;
       this.year = year;
       this.imgUrl = imgUrl;
       this.shortDescription = shortDescription;
    }
}
