package com.meme;

import com.meme.domain.Usuario;
import com.meme.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
public class UsuariosApiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario u1 = new Usuario(null, "Hugo Lima", "hugo@gmail.com", LocalDateTime.now());
		Usuario u2 = new Usuario(null, "Maria Silva", "maria@gmail.com", LocalDateTime.now());
		Usuario u3 = new Usuario(null, "João Gomes", "joao@gmail.com", LocalDateTime.now());
		Usuario u4 = new Usuario(null, "Marco Junior", "marco@gmail.com", LocalDateTime.now());
		Usuario u5 = new Usuario(null, "Gabriel Pires", "gabriel@gmail.com", LocalDateTime.now());

		usuarioRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5));

	}
}
