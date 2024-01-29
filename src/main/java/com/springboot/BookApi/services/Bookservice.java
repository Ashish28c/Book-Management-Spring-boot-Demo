package com.springboot.BookApi.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springboot.BookApi.dao.bookRepo;
import com.springboot.BookApi.entity.Book;

@Component
public class Bookservice {
	
	private bookRepo bookRepo;
	
	public Bookservice(bookRepo bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	public List<Book> getAllBooks(){
		List<Book> list = (List<Book>) bookRepo.findAll();
		return list;
	}
	
	public Book getBookById(int id) {
		Book book = bookRepo.findById(id);
		return book;
	}
	
	public Book addBook(Book book) {
		Book resultBook = bookRepo.save(book);
		return resultBook;
	}
	
	public Book deleteBook(int bookId) {
		bookRepo.deleteById(bookId);
		return null;
	}
	
	public void updatebook(Book book,int bookId) {
		
		book.setId(bookId);
		bookRepo.save(book);
		

	}

	
	
}
	
