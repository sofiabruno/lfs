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
    
//    @Override
//    public boolean esVacia() {
//        return (this.Primero==null);
//    
//    }
//
//    @Override
//    public void agregarInicio(Object dato) {
//        NodoCarpeta nuevo= new NodoCarpeta(dato);
//           if (this.esVacia()){
//               this.Primero=nuevo;
//               this.Ultimo=nuevo;
//           }
//           else{
//               nuevo.siguiente=this.Primero;
//               this.Primero=nuevo;                      
//           }
//    }
//
//    @Override
//    public void borrarInicio() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void borrarFin() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void vaciar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void mostrar() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//
//    @Override
//    public void agregarFinal(Object dato) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

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
    
}
