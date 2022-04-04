package tp02.ejercicio3;
import tp02.ejercicio2.*;
public class ColaGenerica<T> extends ListaGenerica{
	
	private NodoGenerico<T> inicio;
	private NodoGenerico<T> actual;
	private NodoGenerico<T> anterior;
	
	public void comenzar() {
		this.actual = this.inicio;
	}
	
	public void encolar(T elem) {
		this.anterior = this.actual;
		this.actual = this.actual.getSiguiente();
		this.actual = elem;
		
	}
	public T desencolar() {
		T elem = this.inicio;
		this.inicio = this.inicio.getSiguiente();
		this.actual = this.inicio;
		
		return elem;
	}
	public T tope() {
		T elem = this.inicio;
		
		return elem;
	}
	public boolean esVacia() {
		boolean es_vacia = false;
		
		if (this.inicio == this.actual){
			es_vacia = true;
		}
		
		return es_vacia;
	}
	

}
