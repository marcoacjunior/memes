package com.meme.service;

import com.meme.domain.Meme;
import com.meme.dto.MemeDTO;
import com.meme.repositories.MemeRepository;
import com.meme.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MemeService {

    @Autowired
    private MemeRepository repository;

    @Transactional(readOnly = true)
    public Page<MemeDTO> findAllPaged(PageRequest pageRequest) {
        Page<Meme> list = repository.findAll(pageRequest);
        return list.map(x -> new MemeDTO(x));

    }

    @Transactional(readOnly = true)
    public MemeDTO findById(Long id) {
        Optional<Meme> obj = repository.findById(id);
        Meme entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new MemeDTO(entity);

    }

    @Transactional
    public MemeDTO insert(MemeDTO dto) {
        Meme entity = new Meme();
        entity.setNome(dto.getNome());
        entity.setDescricao(dto.getDescricao());
        entity.setImgUrl();
        entity.setDataCadastro(dto.getDataCadastro());
        entity.setCategoriaMeme(dto.getCategoriaMeme());
        entity.setUsuario(dto.getUsuario());
        entity = repository.save(entity);
        return new MemeDTO(entity);
    }

}
