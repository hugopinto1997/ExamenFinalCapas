package com.uca.capas.domain;

import java.math.BigDecimal;
import java.sql.Date;
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
@Table(schema="public", name="producto")
public class Producto {
	@Id
	@GeneratedValue(generator="producto_c_producto_seq", strategy=GenerationType.AUTO)
	@SequenceGenerator(name="producto_c_producto_seq", sequenceName="public.producto_c_producto_seq", allocationSize=1)
	@Column(name="c_producto")
	private Integer cProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="inventario")
	private Integer inventario;
	
	@Column(name="fecha_ingreso")
	private Date fIngreso;
	
	@Column(name="b_activo")
	private Boolean bActivo;
	
	@Column(name="n_precio")
	private BigDecimal nPrecio;
	
	
	@OneToMany(mappedBy="cProducto",orphanRemoval=true ,cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
	private List<Producto> productos;
	
	
	
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Integer getcProducto() {
		return cProducto;
	}

	public void setcProducto(Integer cProducto) {
		this.cProducto = cProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getInventario() {
		return inventario;
	}

	public void setInventario(Integer inventario) {
		this.inventario = inventario;
	}

	public Date getfIngreso() {
		return fIngreso;
	}

	public void setfIngreso(Date fIngreso) {
		this.fIngreso = fIngreso;
	}

	public Boolean getbActivo() {
		return bActivo;
	}

	public void setbActivo(Boolean bActivo) {
		this.bActivo = bActivo;
	}

	public BigDecimal getnPrecio() {
		return nPrecio;
	}

	public void setnPrecio(BigDecimal nPrecio) {
		this.nPrecio = nPrecio;
	}
	
	
	
}
