package com.tsi.v.sakila.connect.SpringbootSakilaProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@SpringBootApplication
@RestController //handles GET, POST, DELETE, PUT request
@RequestMapping("/Sakila")
public class SpringbootSakilaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSakilaProjectApplication.class, args);
	}


}
