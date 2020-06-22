package obligatoriom2020;

public class NodoUnidad {
    Object dato;
    NodoUnidad siguiente;
    ListaCarpeta listaCarpeta;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoUnidad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUnidad siguiente) {
        this.siguiente = siguiente;
    }

    public NodoUnidad(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.listaCarpeta = new ListaCarpeta();
    }
      
    public ListaCarpeta getListaCarpeta() {
        return listaCarpeta;
    }

    public void setListaCarpeta(ListaCarpeta listaCarpeta) {
        this.listaCarpeta = listaCarpeta;
        
    }
 
    
}
