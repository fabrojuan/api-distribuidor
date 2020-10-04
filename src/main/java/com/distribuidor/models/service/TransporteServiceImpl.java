package com.distribuidor.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.distribuidor.models.dao.ITransporteDao;
import com.distribuidor.models.entity.Transporte;

@Service
public class TransporteServiceImpl implements ITransporteService {
	
	@Autowired
	private ITransporteDao transporteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Transporte> findAll() {
		return (List<Transporte>) transporteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Transporte transporte) {
		transporteDao.save(transporte);
	}

	@Override
	@Transactional(readOnly = true)
	public Transporte findById(Long id) {
		return transporteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		transporteDao.deleteById(id);
	}

}
