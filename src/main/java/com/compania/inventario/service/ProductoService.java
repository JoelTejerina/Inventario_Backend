package com.compania.inventario.service;

import org.springframework.http.ResponseEntity;

import com.compania.inventario.bo.Producto;
import com.compania.inventario.response.ProductoResponseRest;

public interface ProductoService {
	
	ResponseEntity<ProductoResponseRest> recuperarProductos();
	
	ResponseEntity<ProductoResponseRest> buscarProductoPorId(Long id);
	
	ResponseEntity<ProductoResponseRest> guardarProductoCategoria(Producto producto, Long idCategoria);
	
	ResponseEntity<ProductoResponseRest> actualizarProducto(Producto producto, Long id);
	
	ResponseEntity<ProductoResponseRest> borrarProducto(Long id);
}
