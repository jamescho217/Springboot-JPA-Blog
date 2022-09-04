package com.cos.blog.test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Spring does not scan all the class files within this package. 
//It scans specific class files that has specific annotations. Then it makes the class files new(IoC) and manages them in the spring container
@RestController
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@Controller
public class BlogControllerTest {
	//https://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot<h1>";
				 
	}
}
