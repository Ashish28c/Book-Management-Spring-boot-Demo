package com.springboot.BookApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString



@Entity
public class Book {
	
	
	@Id
	private int id;
	
	private String bookTitle;
	
	private String author;

}
