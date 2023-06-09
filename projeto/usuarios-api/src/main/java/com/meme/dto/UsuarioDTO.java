package com.meme.dto;

import com.meme.domain.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;
    private LocalDateTime dataCadastro;

    public UsuarioDTO(Usuario entity) {
        nome = entity.getNome();
        email = entity.getEmail();
        dataCadastro = entity.getDataCadastro();
    }
}