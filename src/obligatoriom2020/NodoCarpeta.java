
package obligatoriom2020;

public class NodoCarpeta extends Nodo{
        ListaMensaje listamensaje;

      public NodoCarpeta(Object dato) {
        super(dato);
        this.listamensaje = new ListaMensaje();
    }

    public ListaMensaje getListamensaje() {
        return listamensaje;
    }

    public void setListamensaje(ListaMensaje listamensaje) {
        this.listamensaje = listamensaje;
    }
}
