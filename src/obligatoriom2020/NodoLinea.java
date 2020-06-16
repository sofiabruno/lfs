package obligatoriom2020;

public class NodoLinea extends Nodo {

    ListaPalabra listaPalabras;

    public NodoLinea(Object dato) {
        super(dato);
        this.listaPalabras = new ListaPalabra();
        
    }

    public ListaPalabra getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ListaPalabra listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

}
