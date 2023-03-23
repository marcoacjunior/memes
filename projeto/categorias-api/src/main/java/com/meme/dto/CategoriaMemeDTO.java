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
    private String id;

    private String nomeCategoria;
    private String descricao;

    private LocalDateTime dataCadastro;

    private String usuarioId;


    public CategoriaMemeDTO(CategoriaMeme entity) {
        this.id = entity.getId();
        this.nomeCategoria = entity.getNomeCategoria();
        this.descricao = entity.getDescricao();
        this.dataCadastro = entity.getDataCadastro();
        this.usuarioId = entity.getUsuarioId();

    }

}
