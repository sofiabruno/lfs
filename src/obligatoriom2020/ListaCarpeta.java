package obligatoriom2020;

public class ListaCarpeta implements IListaCarpeta {

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
    
    @Override
    public boolean esVacia() {
        return (this.Primero==null);
    
    }

    @Override
    public void agregarInicio(int n) {
        NodoCarpeta nuevo= new NodoCarpeta(dato,Nombre);
           if (this.esVacia()){
               this.Primero=nuevo;
               this.Ultimo=nuevo;
           }
           else{
               nuevo.siguiente=this.Primero;
               this.Primero=nuevo;                      
           }
    }

    @Override
    public void agregarFinal(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarFin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarInicio(int n, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarFinal(int n, String Nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
