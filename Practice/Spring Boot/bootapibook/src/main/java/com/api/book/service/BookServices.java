package com.api.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.dao.BookRepository;
import com.api.book.entity.Book;

@Service
public class BookServices {

	@Autowired
	private BookRepository bookRepository;

//	private static List<Book> list = new ArrayList<>();
//
//	static {
//		list.add(new Book(11, "Core Java", "abc", 499.0));
//		list.add(new Book(22, "C++", "pqr", 549.0));
//		list.add(new Book(33, "Spring Boot", "xyz", 999.0));
//	}
	//	get all Books
	public List<Book> getAllBooks(){
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;		
//		return list;	
	}

	//	get a book by using Id
	public Book getBookById(int id) {
		Book book = null;
		try {
//			book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			book = this.bookRepository.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}

	//	Add/create book details

	public Book addBook(Book b) {
		Book result = this.bookRepository.save(b);	
//		list.add(b);
		return result;

	}

	//	delete the book

	public void deleteBook(int bid) {
//		list = list.stream().filter(book-> book.getId() != bid).collect(Collectors.toList());
		bookRepository.deleteById(bid);
	}

//	update the book details
	
	public void updateBook(Book book, int bid) {
		
		book.setId(bid);
		bookRepository.save(book);
//		list.stream().map(b -> {
//			if(b.getId() == bid) {
//				b.setTitle(book.getTitle());
//				b.setPrice(book.getPrice());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;		
//		});
	}
	
}
