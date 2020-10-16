package com.distribuidor.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.distribuidor.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{

}
