package tp02.ejercicio3;
import tp02.ejercicio2.*;
public class PilaGenerica<T> extends ListaGenerica<T>{

	private NodoGenerico<T> inicio;
	private NodoGenerico<T> actual;
	private NodoGenerico<T> anterior;

	
	public void apilar(T elem) {
		this.anterior = this.actual;
		this.actual = this.actual.getSiguiente();
		this.actual = elem;
		return elem;
	}
	public T desapilar() {
		
		
		T elem = this.actual;
		this.actual = this.anterior;
		return elem;
	}
	public T tope() {
		T elem = this.actual;
		return elem;
		return elem;
	}
	public boolean esVacia() {
		boolean es_vacia = false;
		if (this.actual == this.inicio){
			es_vacia = false;
		}
		return es_vacia;
	}
	
}
