package com.breakpoint.breakeventpoint.controllers;

import com.breakpoint.breakeventpoint.models.entities.CostoVariableEntity;
import com.breakpoint.breakeventpoint.services.CostoVariableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/v1/costos-variables")
public class CostoVariableController {
    private final CostoVariableService costoVariableService;

    @Autowired
    public CostoVariableController(CostoVariableService costoVariableService) {
        this.costoVariableService = costoVariableService;
    }

    @GetMapping
    public ResponseEntity<List<CostoVariableEntity>> getAllCostosVariables() {
        List<CostoVariableEntity> costosVariables = costoVariableService.getAllCostosVariables();
        return ResponseEntity.ok(costosVariables);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CostoVariableEntity> getCostoVariableById(@PathVariable Long id) {
        Optional<CostoVariableEntity> costoVariableOptional = costoVariableService.getCostoVariableById(id);
        return costoVariableOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<CostoVariableEntity> createCostoVariable(@RequestBody CostoVariableEntity costoVariable) {
        CostoVariableEntity createdCostoVariable = costoVariableService.createCostoVariable(costoVariable);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCostoVariable);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CostoVariableEntity> updateCostoVariable(@PathVariable Long id, @RequestBody CostoVariableEntity costoVariable) {
        CostoVariableEntity updatedCostoVariable = costoVariableService.updateCostoVariable(id, costoVariable);
        return ResponseEntity.ok(updatedCostoVariable);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCostoVariable(@PathVariable Long id) {
        costoVariableService.deleteCostoVariable(id);
        return ResponseEntity.noContent().build();
    }
}
