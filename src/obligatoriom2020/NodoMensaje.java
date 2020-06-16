package obligatoriom2020;

public class NodoMensaje extends Nodo{
    ListaLinea listaLineas;

    public NodoMensaje(Object dato) {
        super(dato);
        this.listaLineas = new ListaLinea();
       
    }

    public ListaLinea getLd() {
        return listaLineas;
    }

    public void setLd(ListaLinea listaLineas) {
        this.listaLineas = listaLineas;
    }

}
