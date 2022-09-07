package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.*;

public class Presupuesto {

	private LocalDate fecha;
	private String cliente;
	
	private List<Item> listaDeItems;
	
	public Presupuesto() {
		this.listaDeItems = new ArrayList<Item>();
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public void agregarItem(Item item) {
		this.listaDeItems.add(item);
	}
	
	public Double calcularTotal() {
		Double total = 0.0;
		Item itemDeLaLista = new Item();
		for(int i=0; i<listaDeItems.size(); i++) {
			itemDeLaLista = listaDeItems.get(i);
			total = total + itemDeLaLista.costo();
		}
		//Iterator<Item> iter = listaDeItems.iterator();
		//while (iter.hasNext()) {
		    //total = total + iter.next().getCostoUnitario();
		//}
		
		//for each
		
		//con for esta bien, pero la idea de estos ejer es que
		//aprendamos a usar streams
		
		return total;
	}

	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
	

	//como hacer la lista correctamente
}
