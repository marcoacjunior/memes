package com.meme.dto;

import com.meme.domain.CategoriaMeme;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaMemeDTO {

    private Long id;

    private String nomeCategoria;

    private String descricao;

    private LocalDateTime dataCadastro;

    private String usuario;

    public CategoriaMemeDTO(CategoriaMeme entity) {
        id = entity.getId();
        nomeCategoria = entity.getNomeCategoria();
        descricao = entity.getDescricao();
        dataCadastro = entity.getDataCadastro();
        usuario = entity.getUsuario();

    }

}
