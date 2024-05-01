package com.breakpoint.breakeventpoint.controllers;

import com.breakpoint.breakeventpoint.models.entities.CostoFijoEntity;
import com.breakpoint.breakeventpoint.services.CostoFijoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/costos-fijos")
public class CostoFijoController {
    private final CostoFijoService costoFijoService;

    @Autowired
    public CostoFijoController(CostoFijoService costoFijoService) {
        this.costoFijoService = costoFijoService;
    }

    @GetMapping
    public ResponseEntity<List<CostoFijoEntity>> getAllCostosFijos() {
        List<CostoFijoEntity> costosFijos = costoFijoService.getAllCostosFijos();
        return ResponseEntity.ok(costosFijos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CostoFijoEntity> getCostoFijoById(@PathVariable Long id) {
        Optional<CostoFijoEntity> costoFijoOptional = costoFijoService.getCostoFijoById(id);
        return costoFijoOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CostoFijoEntity> createCostoFijo(@RequestBody CostoFijoEntity costoFijo) {
        CostoFijoEntity createdCostoFijo = costoFijoService.createCostoFijo(costoFijo);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCostoFijo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CostoFijoEntity> updateCostoFijo(@PathVariable Long id, @RequestBody CostoFijoEntity costoFijo) {
        CostoFijoEntity updatedCostoFijo = costoFijoService.updateCostoFijo(id, costoFijo);
        return ResponseEntity.ok(updatedCostoFijo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCostoFijo(@PathVariable Long id) {
        costoFijoService.deleteCostoFijo(id);
        return ResponseEntity.noContent().build();
    }
}