package com.distribuidor.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transporte")
public class Transporte implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_transporte")
	private long idTransporte;
	private String patente;
	@Column(name = "max_peso")
	private Double maxPeso;
	@Column(name = "max_bultos")
	private Double maxBultos;
	
	public long getIdTransporte() {
		return idTransporte;
	}
	public void setIdTransporte(long idTransporte) {
		this.idTransporte = idTransporte;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Double getMaxPeso() {
		return maxPeso;
	}
	public void setMaxPeso(Double maxPeso) {
		this.maxPeso = maxPeso;
	}
	public Double getMaxBultos() {
		return maxBultos;
	}
	public void setMaxBultos(Double maxBultos) {
		this.maxBultos = maxBultos;
	}

}
