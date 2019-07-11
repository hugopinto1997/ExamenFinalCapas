package com.uca.capas.dto;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.uca.capas.domain.Cliente;
import com.uca.capas.domain.Producto;

public class CompraDTO {
	
	private Integer cProducto;
	private Integer cCliente;
	private Integer nCantidad;	
	private float nTotal;
	public Integer getcProducto() {
		return cProducto;
	}
	public void setcProducto(Integer cProducto) {
		this.cProducto = cProducto;
	}
	public Integer getcCliente() {
		return cCliente;
	}
	public void setcCliente(Integer cCliente) {
		this.cCliente = cCliente;
	}
	public Integer getnCantidad() {
		return nCantidad;
	}
	public void setnCantidad(Integer nCantidad) {
		this.nCantidad = nCantidad;
	}
	public float getnTotal() {
		return nTotal;
	}
	public void setnTotal(float nTotal) {
		this.nTotal = nTotal;
	}
	
	
	
}
