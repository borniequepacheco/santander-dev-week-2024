package com.bornieque.domain.controller;


import com.bornieque.domain.model.Colaborator;
import com.bornieque.domain.service.ColaboratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RequestMapping("/colaborators")
@RestController
public class ColaboratorController {

    private final ColaboratorService colaboratorService;

    public ColaboratorController(ColaboratorService colaboratorService) {
        this.colaboratorService = colaboratorService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Colaborator> findById(@PathVariable Long id){
        var colaborator = colaboratorService.findById(id);
        return ResponseEntity.ok(colaborator);
    }
    @PostMapping
    public ResponseEntity<Colaborator> create (@RequestBody Colaborator colaboratorToCreate){
        var colaborator = colaboratorService.create(colaboratorToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id")
                .buildAndExpand(colaboratorToCreate.getId())
                .toUri();
        return ResponseEntity.created(location).body(colaboratorToCreate);
    }
}
