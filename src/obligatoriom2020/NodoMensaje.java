package obligatoriom2020;

public class NodoMensaje extends Nodo{
    ListaLinea listaLineas;

    public NodoMensaje(Object dato) {
        this.dato = dato;
        this.listaLineas = new ListaLinea();
        this.siguiente = null;
    }

    public ListaLinea getLd() {
        return listaLineas;
    }

    public void setLd(ListaLinea listaLineas) {
        this.listaLineas = listaLineas;
    }

}
