package com.te.springcoreannotationdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotationdemo.bean.Book;
@Configuration
public class BookConfig {
	@Bean
	public Book getbook()
	{
		Book book = new Book();
		book.setBid(10);
		book.setBname("SQL");
		return book;	
		
	}
}
