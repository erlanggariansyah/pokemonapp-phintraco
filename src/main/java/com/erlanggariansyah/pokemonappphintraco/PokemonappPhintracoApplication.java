package com.erlanggariansyah.pokemonappphintraco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class
})
public class PokemonappPhintracoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonappPhintracoApplication.class, args);
	}

}
