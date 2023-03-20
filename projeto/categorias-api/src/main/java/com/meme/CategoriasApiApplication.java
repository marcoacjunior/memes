package com.meme;

import com.meme.domain.CategoriaMeme;
import com.meme.repositories.CategoriaMemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
public class CategoriasApiApplication implements CommandLineRunner {

	@Autowired
	private CategoriaMemeRepository categoriaMemeRepository;


		public static void main (String[]args){SpringApplication.run(CategoriasApiApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {

			CategoriaMeme c1 = new CategoriaMeme(null, "Futebol", "Jogos e Campeonatos", LocalDateTime.now(),"2");
			CategoriaMeme c2 = new CategoriaMeme(null, "Artistas", "Novelas, filmes e Famosos", LocalDateTime.now(),"3");
			CategoriaMeme c3 = new CategoriaMeme(null, "Desenhos", "Desenhos Animados", LocalDateTime.now(),"4");
			CategoriaMeme c4 = new CategoriaMeme(null, "Políticos", "Personalidades Políticas", LocalDateTime.now(),"2");
			CategoriaMeme c5 = new CategoriaMeme(null, "Expressões", "Expressões Populares", LocalDateTime.now(),"5");

			categoriaMemeRepository.saveAll(Arrays.asList(c1, c2, c3,c4, c5));

	}
}

