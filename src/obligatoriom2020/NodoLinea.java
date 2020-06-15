package obligatoriom2020;

public class NodoLinea {

    Object dato;
    NodoLinea siguiente;
    ListaPalabra listaPalabras;

    public NodoLinea(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.listaPalabras = new ListaPalabra();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoLinea getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLinea siguiente) {
        this.siguiente = siguiente;
    }

    public ListaPalabra getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ListaPalabra listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
    
    

}
