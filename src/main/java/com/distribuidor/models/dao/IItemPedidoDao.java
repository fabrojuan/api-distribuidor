package com.distribuidor.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.distribuidor.models.entity.ItemPedido;

public interface IItemPedidoDao extends CrudRepository<ItemPedido, Long>{

}
