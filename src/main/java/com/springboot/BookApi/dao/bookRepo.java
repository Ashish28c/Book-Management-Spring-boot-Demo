package com.springboot.BookApi.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.BookApi.entity.Book;


public interface bookRepo extends CrudRepository<Book, Integer>{
	
	public Book findById(int id);

	

}
