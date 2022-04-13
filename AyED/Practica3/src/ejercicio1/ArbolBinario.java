package ejercicio1;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 
	private int cant_hojas;

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int total_hojas = 0;
		
		//this.recorrerySumar(total_hojas);
		//recorrer arbol y sumar si no tiene ni hi ni hd
		
		this.recorrerySumar2(total_hojas);
		
		return total_hojas.getCant_hojas();
	}
	private void recorrerySumar(Parametro total_hojas){
		
		if(this.esHoja())
			total_hojas.setCant_hojas(total_hojas.getCant_hojas()+1);
		else{
			if(this.tieneHijoIzquierdo())
				this.hijoIzquierdo.recorrerySumar(total_hojas);
			if(this.tieneHijoDerecho())
				this.hijoDerecho.recorrerySumar(total_hojas);
		}
	}
	public int contarHojas2(){
		int total_hojas = 0;
		
		if(this.esHoja())
			return 1;
		else{
			int hojas_hi= 0;
			if(this.tieneHijoIzquierdo())
				hojas_hi = this.hijoIzquierdo.contarHojas2();
			int hojas_hd= 0;
			if(this.tieneHijoDerecho())
				hojas_hd = this.hijoDerecho.contarHojas2();
			return hojas_hi + hojas_hd;
		}
	}
	

    public ArbolBinario<T> espejo() {
		ArbolBinario<T> arbol_espejo = new ArbolBinario<T>();
		
		this.armarArbolEspejo();
    	
		/*//auxiliar para guardar hoja
		T aux;
		//auxiliar para recorrer, arbol == raiz
		ArbolBinario<T> actual = arbol;
		ArbolBinario<T> anterior;
		
		//si tiene hi llamar hasta llegar a null
		if (this.getHijoIzquierdo() != null) 
			anterior = actual;
			actual.espejo(actual.getHijoIzquierdo());
		}
		
		//si hay hi tomarlo
    	if 
		aux = anterior.getHijoIzquierdo();
    	*/
		return arbol_espejo;
	}
    
    private void armarArbolEspejo(){
    	//recorrido por postOrden
    	
    	if(this.esHoja())
    		
    		T aux = this.getDato();
    		
    		
    	if(this.tieneHijoIzquierdo())
    		this.hijoIzquierdo.armarArbolEspejo();
    	if(this.tieneHijoDerecho())
    		this.hijoDerecho.armarArbolEspejo();
    }
    	
	/*
	ir al nodo de mas a la izquierda y luego al de mas a la derecha
	una vez en el final, intercambiar izq, aux y der
	al ir volviendo en los niveles, hacer lo mismo
	hacer el intercambio por niveles? primero el mas bajo, hasta llegar a la raiz
	*/
	public void entreNiveles(int n, int m){
		
	}

	
}
