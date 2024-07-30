package com.bornieque.domain.service;

import com.bornieque.domain.model.Colaborator;

public interface ColaboratorService {
    Colaborator findById(Long id);
    Colaborator create(Colaborator colaboratorToCreate);

}
