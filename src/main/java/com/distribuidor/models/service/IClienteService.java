package com.distribuidor.models.service;

import java.util.List;

import com.distribuidor.models.entity.Cliente;

public interface IClienteService {
	List<Cliente> findAll();
	void save(Cliente cliente);
	Cliente findOne(Long idCliente);
	void delete(Long idCliente);
}
