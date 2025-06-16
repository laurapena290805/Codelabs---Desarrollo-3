package com.holamundo.mimicroservicio.domain.repository;

import com.holamundo.mimicroservicio.domain.model.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoRepository {
    List<Producto> listarProductos();
    Optional<Producto> findById(Long id);
}
