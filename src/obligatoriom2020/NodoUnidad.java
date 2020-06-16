package obligatoriom2020;

public class NodoUnidad extends Nodo{
    ListaCarpeta listaCarpeta;

    public ListaCarpeta getListaCarpeta() {
        return listaCarpeta;
    }

    public void setListaCarpeta(ListaCarpeta listaCarpeta) {
        this.listaCarpeta = listaCarpeta;
        
    }
    
    public NodoUnidad(Object dato) {
        super(dato);
        this.listaCarpeta = new ListaCarpeta();
    
    }
    
}
