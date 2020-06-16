package obligatoriom2020;

public class NodoLinea extends Nodo {

    ListaPalabra listaPalabras;

    public NodoLinea(Object dato) {
        this.listaPalabras = new ListaPalabra();
        this.dato = dato;
        this.siguiente = null;
    }

    public ListaPalabra getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ListaPalabra listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

}
