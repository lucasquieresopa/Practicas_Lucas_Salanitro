package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {

	private String detalle;
	private Integer cantidad;
	private Double costoUnitario;
	
	public Item() {
		
	}
	
	public Item(String detalle, Integer cantidad,
			Double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public Double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public Double costo() {
		return (this.costoUnitario * this.cantidad);
	}

	//estos metodos sirven cuando es Object.nombreMetodo()
	//nombreMetodo generalmente es una variable del objeto
	//lo que hace es mandarle una valor y devolver
	//el mismo objeto
	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}

	public Item costoUnitario(Double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}

	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
	
	
	
	//como hago para darle valor a detalle con Item().detalle();
}
