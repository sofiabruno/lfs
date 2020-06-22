package obligatoriom2020;

public class NodoMensaje {

    Object dato;
    NodoMensaje siguiente;
    ListaLinea listaLineas;

    public NodoMensaje(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.listaLineas = new ListaLinea();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoMensaje getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMensaje siguiente) {
        this.siguiente = siguiente;
    }

    public ListaLinea getListaLineas() {
        return listaLineas;
    }

    public void setListaLineas(ListaLinea listaLineas) {
        this.listaLineas = listaLineas;
    }

}
