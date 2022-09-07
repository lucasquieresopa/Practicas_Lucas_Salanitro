package ar.edu.unlp.info.oo1.ejercicio2_balanza;
import java.util.*;

public class Balanza {
	/*
	private Integer cantidadDeProductos;
	private Double precioTotal;
	private Double pesoTotal;
	*/
	private List<Producto> listaDeProductos;
	

	public Balanza() {
		/*
		this.cantidadDeProductos = 0;
		this.precioTotal = 0.0;
		this.pesoTotal = 0.0;
		*/
		this.listaDeProductos = new ArrayList<Producto>();
	}
	public Integer getCantidadDeProductos() {
		return listaDeProductos.size();
	}

	public Double getPrecioTotal() {
		Double precioTotal = 0.0;
		for(int i=0; i<listaDeProductos.size(); i++) {
			precioTotal = precioTotal + listaDeProductos.get(i).getPrecio();
		}
		return precioTotal;
	}

	public Double getPesoTotal() {
		Double pesoTotal = 0.0;
		for(int i=0; i<listaDeProductos.size(); i++) {
			pesoTotal = pesoTotal + listaDeProductos.get(i).getPeso();
		}
		return pesoTotal;
	}
	
	public void ponerEnCero() {
		/*
		this.cantidadDeProductos = 0;
		this.precioTotal = 0.0;
		this.pesoTotal = 0.0;
		*/
		listaDeProductos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto prod) {
		//this.cantidadDeProductos++;
		this.listaDeProductos.add(prod);
		//this.precioTotal = this.precioTotal + prod.getPrecio();
		//this.pesoTotal = this.pesoTotal + prod.getPeso();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.listaDeProductos.size(),
				this.getPesoTotal(), this.getPrecioTotal());
	}


}
