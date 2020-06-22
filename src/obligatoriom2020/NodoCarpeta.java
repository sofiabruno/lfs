
package obligatoriom2020;

public class NodoCarpeta {
    Object dato;
    NodoCarpeta siguiente;
    ListaMensaje listamensaje;

    public NodoCarpeta(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.listamensaje = new ListaMensaje();
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoCarpeta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCarpeta siguiente) {
        this.siguiente = siguiente;
    }

    public ListaMensaje getListamensaje() {
        return listamensaje;
    }

    public void setListamensaje(ListaMensaje listamensaje) {
        this.listamensaje = listamensaje;
    }

    
}
