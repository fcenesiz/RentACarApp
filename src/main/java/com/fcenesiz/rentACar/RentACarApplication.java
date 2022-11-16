package com.fcenesiz.rentACar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class RentACarApplication {
	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}
}

// mapping: kullanıcının görmesini istemediğimz veriler
//			içerebileceği için gereklidir. Örneğin,
// 		Brand -> id, name, quantity
// 		GetAllBrandsResponse -> id, name