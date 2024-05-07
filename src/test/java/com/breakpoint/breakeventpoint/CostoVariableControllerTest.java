package com.breakpoint.breakeventpoint;

import com.breakpoint.breakeventpoint.controllers.CostoVariableController;
import com.breakpoint.breakeventpoint.models.entities.CostoVariableEntity;
import com.breakpoint.breakeventpoint.services.CostoVariableService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CostoVariableController.class)
public class CostoVariableControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CostoVariableService costoVariableService;

    @Test
    public void testGetAllCostosVariables() throws Exception {
        List<CostoVariableEntity> costosVariables = new ArrayList<>();
        // Agrega algunos costos variables ficticios
        costosVariables.add(
                new CostoVariableEntity(1L, "Materias Primas p/u", 60.00)
        );

        when(costoVariableService.getAllCostosVariables()).thenReturn(costosVariables);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/costos-variables")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print());
        // Agrega más verificaciones según sea necesario
    }
}
