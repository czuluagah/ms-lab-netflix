package co.com.microservicio.tienda.client.model;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("Producto")
public class Producto {
	
	private String descripcion;
	private String marca;
	private String name;
	private String precio;
	
	public Producto(String name, String precio, String descripcion, String marca) {
		super();
		this.name = name;
		this.precio = precio;
		this.descripcion = descripcion;
		this.marca = marca;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
