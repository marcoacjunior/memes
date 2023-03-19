package com.meme.controller;

import com.meme.dto.CategoriaMemeDTO;
import com.meme.service.CategoriaMemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/memelandia")
public class CategoriaMemeController {

    @Autowired
    private CategoriaMemeService service;

    @GetMapping(value = "/categorias")
    public ResponseEntity<Page<CategoriaMemeDTO>> findAll(Pageable pageable) {
        Page<CategoriaMemeDTO> list = service.findAllPaged(pageable);
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/categorias")
    public ResponseEntity<CategoriaMemeDTO> insert(@RequestBody CategoriaMemeDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
