package com.sincronica.pedidoservice.entitie;

import com.sincronica.pedidoservice.dto.ProductoDTO;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}
