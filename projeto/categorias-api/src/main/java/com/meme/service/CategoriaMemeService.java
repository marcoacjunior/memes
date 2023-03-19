package com.meme.service;

import com.meme.domain.CategoriaMeme;
import com.meme.dto.CategoriaMemeDTO;
import com.meme.repositories.CategoriaMemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaMemeService {

    @Autowired
    private CategoriaMemeRepository repository;

    @Transactional(readOnly = true)
    public Page<CategoriaMemeDTO> findAllPaged(Pageable pageable) {
        Page<CategoriaMeme> list = repository.findAll(pageable);
        return list.map(x -> new CategoriaMemeDTO(x));

    }


    @Transactional
    public CategoriaMemeDTO insert(CategoriaMemeDTO dto) {
        CategoriaMeme entity = new CategoriaMeme();
        entity.setNomeCategoria(dto.getNomeCategoria());
        entity.setDescricao(dto.getDescricao());
        entity.setDataCadastro(dto.getDataCadastro());
        entity.setUsuario(dto.getUsuario());
        entity = repository.save(entity);
        return new CategoriaMemeDTO(entity);
    }
}
