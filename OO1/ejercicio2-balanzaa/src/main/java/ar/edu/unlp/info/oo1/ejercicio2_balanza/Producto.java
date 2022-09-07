package ar.edu.unlp.info.oo1.ejercicio2_balanza;

public class Producto {
	private Double peso;
	private Double precioPorKilo;
	private String descripcion;
	
	
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

	
	
}
