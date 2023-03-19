package com.meme;

import com.meme.domain.CategoriaMeme;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class CategoriasApiApplicationTests {

	@Test
	public void CategoriaMemeDeveTerEstrututraCorreta() {

		CategoriaMeme entity = new CategoriaMeme();
		entity.setId(1L);
		entity.setNomeCategoria("Política");
		entity.setDescricao("Imagens relacionados a personalidades da política");
		entity.setDataCadastro(LocalDateTime.now());
		entity.setUsuario("1");

		Assertions.assertNotNull(entity.getId());
		Assertions.assertNotNull(entity.getNomeCategoria());
		Assertions.assertNotNull(entity.getDescricao());
		Assertions.assertNotNull(entity.getDataCadastro());
		Assertions.assertNotNull(entity.getUsuario());
}}
