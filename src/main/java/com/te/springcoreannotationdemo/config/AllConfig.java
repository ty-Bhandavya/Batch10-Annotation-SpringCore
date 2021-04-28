package com.te.springcoreannotationdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({LibraryConfig.class,BookConfig.class})
@Configuration
public class AllConfig {

}
