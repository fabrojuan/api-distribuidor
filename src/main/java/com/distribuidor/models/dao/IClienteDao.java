package com.distribuidor.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.distribuidor.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{
	
}
