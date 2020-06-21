
package obligatoriom2020;

public class ListaMensaje extends Lista {

    NodoMensaje Primero;
    NodoMensaje Ultimo;

    public ListaMensaje() {
        this.Primero = null;
        this.Ultimo = null;
    }

    public NodoMensaje getPrimero() {
        return Primero;
    }

    public void setPrimero(NodoMensaje Primero) {
        this.Primero = Primero;
    }

    public NodoMensaje getUltimo() {
        return Ultimo;
    }

    public void setUltimo(NodoMensaje Ultimo) {
        this.Ultimo = Ultimo;
    }
    
    

}
