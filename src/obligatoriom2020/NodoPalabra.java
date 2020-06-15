
package obligatoriom2020;


public class NodoPalabra {
    Object dato;
    NodoPalabra siguiente;

    public NodoPalabra(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoPalabra getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPalabra siguiente) {
        this.siguiente = siguiente;
    }
    
}
