package com.distribuidor.models.service;

import java.util.List;

import com.distribuidor.models.entity.Carga;
import com.distribuidor.models.entity.Transporte;

public interface ITransporteService {
	List<Transporte> findAll();
	void save(Transporte transporte);
	Transporte findById(Long id);
	void delete(Long id);
}
