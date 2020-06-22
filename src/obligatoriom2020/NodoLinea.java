package obligatoriom2020;

public class NodoLinea  {
    Object dato;
    NodoLinea siguiente;
    ListaPalabra listaPalabras;

    public NodoLinea(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.listaPalabras = new ListaPalabra();
    }



}
