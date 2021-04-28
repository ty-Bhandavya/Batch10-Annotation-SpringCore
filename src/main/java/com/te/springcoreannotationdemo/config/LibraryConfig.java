package com.te.springcoreannotationdemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.te.springcoreannotationdemo.bean.Library;

@Configuration
public class LibraryConfig {
	@Bean
	public Library getObject()
	{
		Library Library = new Library();
		Library.setLid(100);
		Library.setLname("AnkkeGowdaLibrary");
		return Library;
		
	}
}
