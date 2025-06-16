package com.holamundo.mimicroservicio.delivery;

import com.holamundo.mimicroservicio.application.usecase.ListarProductosUseCase;
import com.holamundo.mimicroservicio.domain.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ListarProductosUseCase listarProductosUseCase;

    public ProductoController(ListarProductosUseCase listarProductosUseCase) {
        this.listarProductosUseCase = listarProductosUseCase;
    }

    @GetMapping
    public List<Producto> obtenerProductos() {
        return listarProductosUseCase.ejecutar();
    }
}