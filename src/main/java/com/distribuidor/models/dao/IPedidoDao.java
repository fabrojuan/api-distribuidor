package com.distribuidor.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.distribuidor.models.entity.Pedido;

public interface IPedidoDao extends CrudRepository<Pedido, Long>{

}
