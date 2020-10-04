package com.distribuidor.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.distribuidor.models.entity.Carga;

public interface ICargaDao extends CrudRepository<Carga, Long> {

}
