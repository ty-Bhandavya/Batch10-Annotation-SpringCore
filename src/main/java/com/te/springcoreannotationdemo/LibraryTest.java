package com.te.springcoreannotationdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.te.springcoreannotationdemo.bean.Book;
import com.te.springcoreannotationdemo.bean.Library;
import com.te.springcoreannotationdemo.config.AllConfig;

public class LibraryTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AllConfig.class);
		Library library = context.getBean(Library.class);
		System.out.println(library.getLid());
		System.out.println(library.getLname());
		System.out.println(library.getBook().getBid());
		System.out.println(library.getBook().getBname());
		
		((AbstractApplicationContext) context).close();

	}

}
