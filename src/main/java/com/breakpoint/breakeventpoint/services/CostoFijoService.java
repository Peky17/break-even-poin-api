package com.breakpoint.breakeventpoint.services;

import com.breakpoint.breakeventpoint.models.entities.CostoFijoEntity;
import com.breakpoint.breakeventpoint.repository.CostoFijoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CostoFijoService {
    private final CostoFijoRepository costoFijoRepository;

    @Autowired
    public CostoFijoService(CostoFijoRepository costoFijoRepository) {
        this.costoFijoRepository = costoFijoRepository;
    }

    public List<CostoFijoEntity> getAllCostosFijos() {
        return costoFijoRepository.findAll();
    }

    public Optional<CostoFijoEntity> getCostoFijoById(Long id) {
        return costoFijoRepository.findById(id);
    }

    public CostoFijoEntity createCostoFijo(CostoFijoEntity costoFijo) {
        return costoFijoRepository.save(costoFijo);
    }

    public CostoFijoEntity updateCostoFijo(Long id, CostoFijoEntity costoFijo) {
        Optional<CostoFijoEntity> existingCostoFijoOptional = costoFijoRepository.findById(id);
        if (existingCostoFijoOptional.isPresent()) {
            CostoFijoEntity existingCostoFijo = existingCostoFijoOptional.get();
            existingCostoFijo.setDescripcion(costoFijo.getDescripcion());
            existingCostoFijo.setMonto(costoFijo.getMonto());
            return costoFijoRepository.save(existingCostoFijo);
        } else {
            throw new RuntimeException("El costo fijo con ID " + id + " no existe.");
        }
    }

    public void deleteCostoFijo(Long id) {
        costoFijoRepository.deleteById(id);
    }
}
