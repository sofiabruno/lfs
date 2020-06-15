package obligatoriom2020;

public class NodoMensaje {

    Object dato; //nombre del archivo es el dato  
    NodoMensaje siguiente;
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

    public Object getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoMensaje getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMensaje siguiente) {
        this.siguiente = siguiente;
    }

}
