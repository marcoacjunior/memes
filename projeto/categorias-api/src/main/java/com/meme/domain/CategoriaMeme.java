package com.meme.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaMeme {

    @Id
    private String id;

    @NotNull
    @Size(min = 1, max = 50)
    private String nomeCategoria;

    @NotNull
    @Size(min = 1, max = 50)
    private String descricao;

    @NotNull
    private LocalDateTime dataCadastro;

    @NotNull
    private String usuarioId;

}