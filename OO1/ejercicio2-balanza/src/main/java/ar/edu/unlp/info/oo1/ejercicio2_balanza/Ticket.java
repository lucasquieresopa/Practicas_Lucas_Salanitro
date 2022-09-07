package ar.edu.unlp.info.oo1.ejercicio2_balanza;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private Integer cantidadDeProductos;
	private Double pesoTotal;
	private Double precioTotal;
	
	public Ticket(Integer cant, double peso, double precio) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cant;
		this.pesoTotal = peso;
		this.precioTotal = precio;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public Double getPesoTotal() {
		return pesoTotal;
	}
	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public Double impuesto() {
		return ((21*this.precioTotal)/100);
	}
	
}
