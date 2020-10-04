package com.distribuidor.models.service;

import java.util.List;

import com.distribuidor.models.entity.Carga;
import com.distribuidor.models.entity.Cliente;

public interface ICargaService {
	List<Carga> findAll();
	void save(Carga carga);
	Carga findById(Long idCarga);
	void delete(Long idCarga);
}
