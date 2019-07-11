package com.uca.capas.domain;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="compra")
public class Compra {
	@Id
	@GeneratedValue(generator="compra_c_orden_compra_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="compra_c_orden_compra_seq", sequenceName="public.compra_c_orden_compra_seq", allocationSize=1)
	@Column(name="c_orden_compra")
	private Integer cOrdenCompra;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="c_producto")
	private Producto cProducto;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="c_cliente")
	private Cliente cCliente;
	
	@Column(name="n_cantidad")
	private Integer nCantidad;
	
	@Column(name="f_compra")
	private Date fCompra;
	
	@Column(name="n_total")
	private float nTotal;
	
	public String getfci() {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/YYYY");
		return f.format(this.fCompra);
	}

	public Integer getcOrdenCompra() {
		return cOrdenCompra;
	}

	public void setcOrdenCompra(Integer cOrdenCompra) {
		this.cOrdenCompra = cOrdenCompra;
	}

	public Producto getcProducto() {
		return cProducto;
	}

	public void setcProducto(Producto cProducto) {
		this.cProducto = cProducto;
	}

	public Cliente getcCliente() {
		return cCliente;
	}

	public void setcCliente(Cliente cCliente) {
		this.cCliente = cCliente;
	}

	public Integer getnCantidad() {
		return nCantidad;
	}

	public void setnCantidad(Integer nCantidad) {
		this.nCantidad = nCantidad;
	}

	public Date getfCompra() {
		return fCompra;
	}

	public void setfCompra(Date fCompra) {
		this.fCompra = fCompra;
	}

	public float getnTotal() {
		return nTotal;
	}

	public void setnTotal(float nTotal) {
		this.nTotal = nTotal;
	}
	
	
	
}
