
package obligatoriom2020;


public class ListaPalabra extends Lista {
    NodoPalabra Primero;
    NodoPalabra Ultimo;

    public ListaPalabra() {
        this.Primero = null;
        this.Ultimo = null;
    }

    public NodoPalabra getPrimero() {
        return Primero;
    }

    public void setPrimero(NodoPalabra Primero) {
        this.Primero = Primero;
    }

    public NodoPalabra getUltimo() {
        return Ultimo;
    }

    public void setUltimo(NodoPalabra Ultimo) {
        this.Ultimo = Ultimo;
    }
    
    
}
