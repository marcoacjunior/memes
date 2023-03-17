package com.meme.service;

import com.meme.domain.Usuario;
import com.meme.dto.UsuarioDTO;
import com.meme.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public List<UsuarioDTO> findAll() {
        List<Usuario> list = repository.findAll(Sort.by("nome"));
        return list.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());

    }

    @Transactional
    public UsuarioDTO insert(UsuarioDTO dto) {
        Usuario entity = new Usuario();
        entity.setNome(dto.getNome());
        entity.setEmail(dto.getEmail());
        entity.setDataCadastro(dto.getDataCadastro());
        entity = repository.save(entity);
        return new UsuarioDTO(entity);
    }

}
