package com.breakpoint.breakeventpoint.services;

import com.breakpoint.breakeventpoint.models.entities.CostoVariableEntity;
import com.breakpoint.breakeventpoint.repository.CostoVariableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostoVariableService {
    private final CostoVariableRepository costoVariableRepository;

    @Autowired
    public CostoVariableService(CostoVariableRepository costoVariableRepository) {
        this.costoVariableRepository = costoVariableRepository;
    }

    public List<CostoVariableEntity> getAllCostosVariables() {
        return costoVariableRepository.findAll();
    }

    public Optional<CostoVariableEntity> getCostoVariableById(Long id) {
        return costoVariableRepository.findById(id);
    }

    public CostoVariableEntity createCostoVariable(CostoVariableEntity costoVariable) {
        return costoVariableRepository.save(costoVariable);
    }

    public CostoVariableEntity updateCostoVariable(Long id, CostoVariableEntity costoVariable) {
        Optional<CostoVariableEntity> existingCostoVariableOptional = costoVariableRepository.findById(id);
        if (existingCostoVariableOptional.isPresent()) {
            CostoVariableEntity existingCostoVariable = existingCostoVariableOptional.get();
            existingCostoVariable.setDescripcion(costoVariable.getDescripcion());
            existingCostoVariable.setMonto(costoVariable.getMonto());
            return costoVariableRepository.save(existingCostoVariable);
        } else {
            throw new RuntimeException("El costo variable con ID " + id + " no existe.");
        }
    }

    public void deleteCostoVariable(Long id) {
        costoVariableRepository.deleteById(id);
    }
}
