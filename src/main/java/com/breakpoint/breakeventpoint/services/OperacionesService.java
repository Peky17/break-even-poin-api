package com.breakpoint.breakeventpoint.services;

import com.breakpoint.breakeventpoint.repository.CostoFijoRepository;
import com.breakpoint.breakeventpoint.repository.CostoVariableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperacionesService {
    private final CostoVariableRepository costoVariableRepository;
    private final CostoFijoRepository costoFijoRepository;
    @Autowired
    public OperacionesService(CostoVariableRepository costoVariableRepository, CostoFijoRepository costoFijoRepository) {
        this.costoVariableRepository = costoVariableRepository;
        this.costoFijoRepository = costoFijoRepository;
    }

    /*
    * Método para obtener el total de los costos variables mensuales
    */
    public double getTotalCV() {
        return costoVariableRepository.getSumaMontos();
    }

    /*
     * Método para obtener el total de los costos fijos mensuales
    */
    public double getTotalCF() {
        return costoFijoRepository.getSumaMontos();
    }
}
