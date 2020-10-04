package com.distribuidor.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="carga")
public class Carga implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_carga")
	private Long idCarga;
	@Column(name = "id_transporte")
	private Long idTransporte;
	@Column(name = "fecha_alta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAlta;
	
	@PrePersist
	public void prePersist() {
		fechaAlta = new Date();
	}
	
	public Long getIdCarga() {
		return idCarga;
	}
	public void setIdCarga(Long idCarga) {
		this.idCarga = idCarga;
	}
	public Long getIdTransporte() {
		return idTransporte;
	}
	public void setIdTransporte(Long idTransporte) {
		this.idTransporte = idTransporte;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

}
