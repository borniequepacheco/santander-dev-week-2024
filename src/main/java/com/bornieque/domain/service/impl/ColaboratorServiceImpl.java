package com.bornieque.domain.service.impl;

import com.bornieque.domain.model.Colaborator;
import com.bornieque.domain.repository.ColaboratorRepository;
import com.bornieque.domain.service.ColaboratorService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ColaboratorServiceImpl implements ColaboratorService {

    private final ColaboratorRepository colaboratorRepository;

    public ColaboratorServiceImpl(ColaboratorRepository colaboratorRepository) {
        this.colaboratorRepository = colaboratorRepository;
    }

    @Override
    public Colaborator findById(Long id) {
        return colaboratorRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Colaborator create(Colaborator colaboratorToCreate) {
        if(colaboratorRepository.existsById(colaboratorToCreate.getId())) {
            throw new IllegalArgumentException("Este colaborador ID já existe");
        }
        return colaboratorRepository.save(colaboratorToCreate);
    }
}
