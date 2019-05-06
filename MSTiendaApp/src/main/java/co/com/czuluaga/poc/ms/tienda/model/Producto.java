package co.com.czuluaga.poc.ms.tienda.model;

public class Producto {
	
	private String name;
	private String precio;
	private String descripcion;
	private String marca;
	
	
	
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
