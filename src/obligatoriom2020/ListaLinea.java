package obligatoriom2020;

public class ListaLinea implements ILista {

    NodoLinea Primero;
    NodoLinea Ultimo;
    public int cantelementos;

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

    public ListaLinea() {
        this.Primero = null;
        this.Ultimo = null;
        this.cantelementos = 0;
    }

//    Metodos
    @Override
    public boolean esVacia() {
        return (this.Primero == null);
    }

    //PRE: 
    //POS: Agrega un nuevo Nodo al principio de la lista
    @Override
    public void agregarInicio(Object dato) {
        NodoLinea nuevo = new NodoLinea(dato);
        nuevo.setSiguiente(Primero);
        this.Primero = nuevo;
        if (this.Ultimo == null)//estoy insertando el primer nodo
        {
            this.Ultimo = nuevo;
        }

        this.cantelementos = this.cantelementos + 1;
    }

    //PRE:
    //POS: Borra el primer nodo
    @Override
    public void borrarInicio() {
        if (!this.esVacia()) {
            this.Primero = this.Primero.getSiguiente();
            this.cantelementos = this.cantelementos - 1;
        }
    }
    //PRE:
    //POS: elimina todos los nodos de una lista dada

    @Override
    public void vaciar() {
        this.Primero = null;
        this.Ultimo = null;
        this.cantelementos = 0;
    }

    //PRE:
    //POS: Recorre y muestra los datos de lista
    @Override
    public void mostrar() {
        if (this.esVacia()) {
            System.out.println("Lista es vacía");
        } else {
            NodoLinea aux = this.Primero;
            int contador = 1;
            while (aux != null) {
                System.out.println(contador + ": " + aux.getDato().toString());
                aux = aux.getSiguiente();
                contador ++;
            }
        }
    }

    /*Variantes agregadas a los metodos basicos.*/
    //PRE:
    //POS: Agrega un nuevo Nodo al Ultimo de la lista
    @Override
    public void agregarFinal(Object dato) {
        if (this.esVacia()) {
            this.agregarInicio(dato); // el agregar Primero suma 1 a cantelementos
        } else {
            NodoLinea nuevo = (NodoLinea) dato;
            Ultimo.setSiguiente(nuevo);
            Ultimo = nuevo;
            this.cantelementos = this.cantelementos + 1;
        }

    }

    //PRE:
    //POS: Borra el último nodo
    @Override
    public void borrarFin() {
        if (!this.esVacia()) {
            if (this.Primero == this.Ultimo) {
                this.borrarInicio();  // actualiza canelementos
            } else {
                NodoLinea aux = this.Primero;
                while (aux.getSiguiente().getSiguiente() != null) {
                    aux = aux.getSiguiente();
                }
                this.Ultimo = aux;
                this.Ultimo.setSiguiente(null);
                this.cantelementos = this.cantelementos - 1;
            }
        }
    }

    //PRE: lista ordenada => mantiena orden
    //POS: inserta nuevo elemento en orden ascendente
    @Override
    public void agregarOrd(Object dato) {
        NodoLinea n = new NodoLinea(dato);
        if (this.esVacia() || this.Primero.getDato().toString().compareToIgnoreCase(n.getDato().toString()) > 0) {
            // A.compareToIgnoreCase(B) - Si A > B entonces el valor retorno es +1, siendo B el dato nuevo a ingresar  
            this.agregarInicio(n);
        } else if (this.Ultimo.getDato().toString().compareToIgnoreCase(n.getDato().toString()) < 0) {
            // A.compareToIgnoreCase(B) - Si A < B entonces el valor retorno es -1, siendo B el dato nuevo a ingresar
            this.agregarFinal(n);
        } else {
            NodoLinea aux = this.Primero;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().toString().compareToIgnoreCase(n.getDato().toString()) < 0) {
                aux.getSiguiente();
            }
            n.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(n);
        }

//        ojo  q no afecta la cant elementos 
    }

    //PRE: lista ordenada
    //POS: Borra la primer ocurrencia de un elemento dado
    public void borrarElemento(Object dato) {
        // implementar el metodo

        if (this.Primero != null) {
            NodoLinea aux = this.Primero;

            while (aux != null) {
                if (aux.getDato().equals(dato)) {
                    this.borrarInicio();
                } else {
                    while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != dato) {
                        aux = aux.getSiguiente();
                    }
                    if (aux.getSiguiente() != null) {
                        NodoLinea borrar = aux.getSiguiente();
                        aux.setSiguiente(borrar.getSiguiente());
                        borrar.setSiguiente(null);
                    }
                }
                aux = aux.getSiguiente();
            }
        }
    }

    //PRE: 
    //POS: Retorna la cantidad de nodos que tiene la lista
//    public int cantElementos() {
//        return this.cantelementos;
//    }
    //PRE: //POS:
    //PRE: //POS:
    public NodoLinea obtenerElemento(Object dato) {
        NodoLinea aux = this.Primero;
        while (aux != null && aux.getDato() != dato) {
            aux = aux.getSiguiente();
        }
        //encontre dato o llegue al Ultimoal
        return aux;
    }

    /**
     * *** para resolver en forma recursiva Métodos RECURSIVOS
     *
     * @param l ****
     */
    //PRE:
    //POS: muestra los datos de la lista en orden de enlace
    public void mostrarREC(NodoLinea l) {
        if (l != null) {
            System.out.println(l.getDato());
            mostrarREC(l.getSiguiente());

        }
    }

    public NodoLinea buscarPorPosicion(int posicionLinea) {

        if (posicionLinea >= 1 && posicionLinea <= this.cantelementos) {
            if (posicionLinea == 1) {
                return this.Primero;
            } else {
                NodoLinea aux = this.Primero;
                for (int i = 0; i < posicionLinea; i++) {
                    aux = aux.getSiguiente();
                }
                return aux;
            }
        } else {
            NodoLinea aux = null;
            return aux;
        }

    }
}
