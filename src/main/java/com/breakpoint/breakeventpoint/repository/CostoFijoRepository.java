package com.breakpoint.breakeventpoint.repository;

import com.breakpoint.breakeventpoint.models.entities.CostoFijoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CostoFijoRepository extends JpaRepository<CostoFijoEntity, Long> {
    @Query("SELECT SUM(cf.monto) FROM CostoFijoEntity cf")
    double getSumaMontos();
}