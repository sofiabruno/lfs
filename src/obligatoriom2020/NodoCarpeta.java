
package obligatoriom2020;

public class NodoCarpeta extends Nodo{
        ListaMensaje listamensaje;

      public NodoCarpeta(Object dato) {
        this.dato = dato;
        this.siguiente = null;
        this.listamensaje = new ListaMensaje();
    }

     public ListaMensaje getLd() {
        return listamensaje;
    }

    public void setLd(ListaMensaje ld) {
        this.listamensaje = ld;
    }
}
