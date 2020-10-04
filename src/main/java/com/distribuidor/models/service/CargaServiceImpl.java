package com.distribuidor.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuidor.models.dao.ICargaDao;
import com.distribuidor.models.entity.Carga;
import com.distribuidor.models.entity.Cliente;

@Service
public class CargaServiceImpl implements ICargaService {

	@Autowired
	private ICargaDao cargaDao;

	@Override
	@Transactional(readOnly = true)
	public List<Carga> findAll() {
		return (List<Carga>) cargaDao.findAll();
	}

	@Override
	@Transactional
	public void save(Carga carga) {
		cargaDao.save(carga);		
	}

	@Override
	@Transactional(readOnly = true)
	public Carga findById(Long idCarga) {
		return cargaDao.findById(idCarga).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long idCarga) {
		cargaDao.deleteById(idCarga);
	}

}
