package com.meme;

import com.meme.domain.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class UsuariosApiApplicationTests {

	@Test
	public void UsuarioDeveTerEstrututraCorreta() {

		Usuario entity = new Usuario();
		entity.setId(1L);
		entity.setNome("Plinio");
		entity.setEmail("plinio@gmail.com");
		entity.setDataCadastro(LocalDateTime.now());

		Assertions.assertNotNull(entity.getId());
		Assertions.assertNotNull(entity.getNome());
		Assertions.assertNotNull(entity.getDataCadastro());

	}
}
