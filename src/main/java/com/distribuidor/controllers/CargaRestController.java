package com.distribuidor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.distribuidor.models.entity.Carga;
import com.distribuidor.models.service.ICargaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CargaRestController {

	@Autowired
	private ICargaService cargaService;
	
	@GetMapping("/cargas")
	@ResponseStatus(HttpStatus.OK)
	public List<Carga> index() {
		return cargaService.findAll();
	}
	
	@GetMapping("/cargas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Carga findById(@PathVariable("id") Long idCarga) {
		return cargaService.findById(idCarga);
	}
	
	@PostMapping("/cargas")
	@ResponseStatus(HttpStatus.CREATED)
	public Carga create(@RequestBody Carga carga) {
		cargaService.save(carga);
		return carga;
	}
	
	@PutMapping("/cargas/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Carga update(@RequestBody Carga carga, @PathVariable("id") Long idCarga) {
		Carga actual = cargaService.findById(idCarga);
		actual.setIdTransporte(carga.getIdTransporte());
		cargaService.save(actual);
		return actual;
	}
	
	@DeleteMapping("/cargas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long idCarga) {
		cargaService.delete(idCarga);
	}
}
