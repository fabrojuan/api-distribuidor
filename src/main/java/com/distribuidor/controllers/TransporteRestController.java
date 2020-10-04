package com.distribuidor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.distribuidor.models.entity.Transporte;
import com.distribuidor.models.service.ITransporteService;

@RestController
@RequestMapping("/api")
public class TransporteRestController {

	@Autowired
	private ITransporteService transporteService;
	
	@GetMapping("/transportes")
	@ResponseStatus(HttpStatus.OK)
	public List<Transporte> index() {
		return transporteService.findAll();
	}
	
	@GetMapping("/transportes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Transporte findById(@PathVariable Long id) {
		return transporteService.findById(id);
	}
	
	@PostMapping("/transportes")
	@ResponseStatus(HttpStatus.CREATED)
	public Transporte create(@RequestBody Transporte transporte) {
		transporteService.save(transporte);
		return transporte;
	}
	
	@PutMapping("/transportes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Transporte update(@RequestBody Transporte transporte, @PathVariable Long id) {
		Transporte actual = transporteService.findById(id);
		actual.setPatente(transporte.getPatente());
		actual.setMaxPeso(transporte.getMaxPeso());
		actual.setMaxBultos(transporte.getMaxBultos());
		
		transporteService.save(actual);
		return actual;
	}
	
	@DeleteMapping("/transportes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		transporteService.delete(id);
	}
}
