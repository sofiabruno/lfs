
package obligatoriom2020;

public class ListaLinea extends Lista {
    NodoLinea Primero;
    NodoLinea Ultimo;

    public ListaLinea() {
        this.Primero = null;
        this.Ultimo = null;
    }

    
    
    public NodoLinea getPrimero() {
        return Primero;
    }

    public void setPrimero(NodoLinea Primero) {
        this.Primero = Primero;
    }

    public NodoLinea getUltimo() {
        return Ultimo;
    }

    public void setUltimo(NodoLinea Ultimo) {
        this.Ultimo = Ultimo;
    }
    
      public Retorno InsertarLinea() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }
    
    
}
