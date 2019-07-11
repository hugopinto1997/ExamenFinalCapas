package com.uca.capas.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(generator="cliente_c_cliente_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="cliente_c_cliente_seq", sequenceName="public.cliente_c_cliente_seq", allocationSize=1)
	@Column(name="c_cliente")
	private Integer cCliente;
	
	@Column(name="s_nombre")
	private String sNombre;
	
	@Column(name="s_apellido")
	private String sApellido;
	
	@Column(name="b_activo")
	private Boolean bActivo;
	
	@OneToMany(mappedBy="cCliente",orphanRemoval=true ,cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	private List<Cliente> clientes;

	public Integer getcCliente() {
		return cCliente;
	}

	public void setcCliente(Integer cCliente) {
		this.cCliente = cCliente;
	}

	public String getsNombre() {
		return sNombre;
	}

	public void setsNombre(String sNombre) {
		this.sNombre = sNombre;
	}

	public String getsApellido() {
		return sApellido;
	}

	public void setsApellido(String sApellido) {
		this.sApellido = sApellido;
	}

	public Boolean getbActivo() {
		return bActivo;
	}

	public void setbActivo(Boolean bActivo) {
		this.bActivo = bActivo;
	}
	
	
	
	
	
}
