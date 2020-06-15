
package obligatoriom2020;

public class NodoCarpeta {
        Object dato;     //en este nodo el dato representa el nombre de la carpeta
        ListaMensaje ld;
        NodoCarpeta siguiente;

    public NodoCarpeta(Object dato) {
        this.dato = dato;
        this.ld= new ListaMensaje();
        this.siguiente = null;
    }

     public ListaMensaje getLd() {
        return ld;
    }

    public void setLd(ListaMensaje ld) {
        this.ld = ld;
    }
   
 
    public Object getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoCarpeta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCarpeta siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
