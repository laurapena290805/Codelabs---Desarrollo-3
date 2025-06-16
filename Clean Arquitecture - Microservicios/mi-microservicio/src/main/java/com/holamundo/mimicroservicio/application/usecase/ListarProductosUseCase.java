package com.holamundo.mimicroservicio.application.usecase;

import com.holamundo.mimicroservicio.domain.model.Producto;
import com.holamundo.mimicroservicio.domain.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ListarProductosUseCase {
    private final ProductoRepository productoRepository;

    public ListarProductosUseCase(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<Producto> ejecutar() {
        return productoRepository.listarProductos();
    }
}