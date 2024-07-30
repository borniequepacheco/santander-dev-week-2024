package com.bornieque.domain.repository;

import com.bornieque.domain.model.Colaborator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboratorRepository extends JpaRepository<Colaborator, Long> {

}
