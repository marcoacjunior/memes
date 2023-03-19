package com.meme;

import com.meme.domain.Meme;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class MemesApiApplicationTests {

	@Test
	public void MemeDeveTerEstrututraCorreta() {

		Meme entity = new Meme();
		entity.setId(1L);
		entity.setNome("Chapolin")Chapolin
		entity.setDescricao("Imagens relacionados a personalidades da política");
		entity.setImgUrl("https://img.r7.com/images/2014/08/26/9foghewoij_26xncb11n5_file?dimensions=500x543");
		entity.setDataCadastro(LocalDateTime.now());
		entity.setCategoriaMeme("1");
		entity.setUsuario("1");

		Assertions.assertNotNull(entity.getId());
		Assertions.assertNotNull(entity.getDescricao());
		Assertions.assertNotNull(entity.getDataCadastro());
		Assertions.assertNotNull(entity.getCategoriaMeme());
		Assertions.assertNotNull(entity.getUsuario());
	}

}
