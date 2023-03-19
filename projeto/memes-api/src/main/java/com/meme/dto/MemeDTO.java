package com.meme.dto;

import com.meme.domain.Meme;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemeDTO {

    private Long id;
    private String nome;
    private String descricao;

    private String imgUrl;
    private LocalDateTime dataCadastro;
    private String categoriaMeme;
    private String usuario;

    public MemeDTO(Meme entity) {
        id = entity.getId();
        nome = entity.getNome();
        descricao = entity.getDescricao();
        imgUrl = entity.getImgUrl();
        dataCadastro = entity.getDataCadastro();
        categoriaMeme = entity.getCategoriaMeme();
        usuario = entity.getUsuario();


    }
}