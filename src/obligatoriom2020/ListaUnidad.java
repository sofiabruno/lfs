package obligatoriom2020;

public class ListaUnidad extends Lista {

    NodoUnidad Primero;
    NodoUnidad Ultimo;

    public NodoUnidad getPrimero() {
        return Primero;
    }

    public void setPrimero(NodoUnidad Primero) {
        this.Primero = Primero;
    }

    public NodoUnidad getUltimo() {
        return Ultimo;
    }

    public void setUltimo(NodoUnidad Ultimo) {
        this.Ultimo = Ultimo;
    }

      public ListaUnidad() {
        this.Primero = null;
        this.Ultimo = null;
    }


    
}
