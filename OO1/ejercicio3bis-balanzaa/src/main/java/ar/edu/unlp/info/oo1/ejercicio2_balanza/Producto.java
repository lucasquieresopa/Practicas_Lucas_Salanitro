package ar.edu.unlp.info.oo1.ejercicio2_balanza;

public class Producto {
	private Double peso;
	private Double precioPorKilo;
	private String descripcion;
	
	
	public Producto(Double peso, Double precioPorKilo, String descripcion) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
	public Producto() {
		
	}
	
	public Double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public Double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Double getPrecio() {
		return this.precioPorKilo * this.peso; 
	}

	public Producto peso(double peso) {
		this.peso = peso;
		return this;
	}

	public Producto precioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
		return this;
	}

	public Producto descripcion(String descripcion) {
		this.descripcion = descripcion;
		return this;
	}

	
	
}
