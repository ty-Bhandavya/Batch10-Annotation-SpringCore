package com.te.springcoreannotationdemo.bean;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;
@Data
public class Book {
	public Book() {

	}
	private int bid;
	private String bname;
	
}
