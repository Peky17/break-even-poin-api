package com.breakpoint.breakeventpoint.controllers;

import com.breakpoint.breakeventpoint.services.OperacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/operaciones")
public class operacionesController {
    private final OperacionesService operacionesService;
    @Autowired
    public operacionesController(OperacionesService operacionesService) {
        this.operacionesService = operacionesService;
    }

    @GetMapping("/getTotalCV")
    public ResponseEntity<Double> getTotalCV() {
        double sumaMontos = operacionesService.getTotalCV();
        return ResponseEntity.ok(sumaMontos);
    }

    @GetMapping("/getTotalCF")
    public ResponseEntity<Double> getTotalCF() {
        double sumaMontos = operacionesService.getTotalCF();
        return ResponseEntity.ok(sumaMontos);
    }
}
