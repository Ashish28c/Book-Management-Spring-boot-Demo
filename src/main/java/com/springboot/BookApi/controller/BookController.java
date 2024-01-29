package com.springboot.BookApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.BookApi.entity.Book;
import com.springboot.BookApi.services.Bookservice;

@RestController
public class BookController {
	
	
	@Autowired
	private Bookservice bookservice;
	
	
	@GetMapping("/book")
	public List<Book> getBook() {
		
		return this.bookservice.getAllBooks();
		
	}
	
	@PostMapping("/book")
	public Book addbook(@RequestBody Book book) {
		
		Book b = this.bookservice.addBook(book);
		return b;
		
	} 
	
	@DeleteMapping("/book/{bookId}")
	public Book DeleteBook(@PathVariable("bookId") int bookId) {
		return this.bookservice.deleteBook(bookId);
		
	}
	
	@PutMapping("/book/{bookId}")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		
		this.bookservice.updatebook(book, bookId);
		return book;
		
	}
		

	

}
