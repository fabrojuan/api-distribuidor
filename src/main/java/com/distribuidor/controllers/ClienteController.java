package com.distribuidor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.distribuidor.models.dao.IClienteDao;
import com.distribuidor.models.entity.Cliente;
import com.distribuidor.models.service.IClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;

	public List<Cliente> listar() {
		return clienteService.findAll();
	}
	
	public void save(Cliente cliente) {
		clienteService.save(cliente);
	}
	
	public Cliente findOne(Long idCliente) {
		return clienteService.findOne(idCliente);
	}
	
	public void delete(Long idCliente) {
		clienteService.delete(idCliente);
	}
	
}
