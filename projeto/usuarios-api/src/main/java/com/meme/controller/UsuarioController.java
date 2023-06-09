package com.meme.controller;

import com.meme.dto.UsuarioDTO;
import com.meme.services.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/memelandia")
@Slf4j
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public String status(){
        log.info("Obtendo o status do microservice de usuarios");
        return "ok";
    }

    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<UsuarioDTO>> findAll() {
        List<UsuarioDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping(value = "/usuarios")
    public ResponseEntity<UsuarioDTO> insert(@RequestBody UsuarioDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
