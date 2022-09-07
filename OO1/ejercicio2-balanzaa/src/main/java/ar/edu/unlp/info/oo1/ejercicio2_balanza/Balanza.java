package ar.edu.unlp.info.oo1.ejercicio2_balanza;

public class Balanza {
	private Integer cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0.0;
		this.pesoTotal = 0.0;
	}
		
	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0.0;
		this.pesoTotal = 0.0;
	}
	
	public void agregarProducto(Producto prod) {
		this.cantidadDeProductos++;
		this.precioTotal = this.precioTotal + prod.getPrecio();
		this.pesoTotal = this.pesoTotal + prod.getPeso();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos,
				this.pesoTotal, this.precioTotal);
	}
}
