package obligatoriom2020;

public class ListaCarpeta extends Lista {

    NodoCarpeta Primero;
    NodoCarpeta Ultimo;

      public ListaCarpeta() {
        this.Primero = null;
        this.Ultimo = null;
    }

    public NodoCarpeta getPrimero() {
        return Primero;
    }

    public void setPrimero(NodoCarpeta Primero) {
        this.Primero = Primero;
    }

    public NodoCarpeta getUltimo() {
        return Ultimo;
    }

    public void setUltimo(NodoCarpeta Ultimo) {
        this.Ultimo = Ultimo;
    }
   
    public boolean buscarelemento(Object dato) {
        Nodo aux = this.Primero;
        while (aux != null) {
            if (aux.getDato() == dato) {
                return true;
            }
            aux = aux.siguiente;
        }
        return false;
    }
    
    @Override
    public NodoCarpeta obtenerElemento(Object dato) {
        NodoCarpeta aux = this.Primero;
        while (aux != null && aux.getDato() != dato) {
            aux = (NodoCarpeta) aux.getSiguiente();
        }
        //encontrÃ© dato o lleguÃ© al final
        return aux;
    }
    
}
