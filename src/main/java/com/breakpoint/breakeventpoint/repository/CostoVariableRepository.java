package com.breakpoint.breakeventpoint.repository;

import com.breakpoint.breakeventpoint.models.entities.CostoVariableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostoVariableRepository extends JpaRepository<CostoVariableEntity, Long> {
}