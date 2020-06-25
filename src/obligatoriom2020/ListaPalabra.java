package obligatoriom2020;

public class ListaPalabra implements ILista {

    NodoPalabra Primero;
    NodoPalabra Ultimo;
    public int cantelementos;

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

    public ListaPalabra() {
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
        NodoPalabra nuevo = (NodoPalabra) dato; // new NodoPalabra(dato); //
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
            NodoPalabra aux = this.Primero;
            while (aux != null) {
                System.out.println(aux.getDato());
                aux = aux.siguiente;
            }
        }
    }

    public void mostrarLinea() {
        if (this.esVacia()) {
            System.out.println("La Linea está vacía");
        } else {
            NodoPalabra aux = this.Primero;
            while (aux != null) {
                System.out.print(aux.getDato() + " ");
                aux = aux.siguiente;
                //para que no se junte la linea con el -------Testeo--------
            }
            if (aux == null) {
                System.out.println("");
            }
        }
    }

    public String mostrarPalabras() {
        String salida = "";
        if (this.esVacia()) {
            salida = "";
        } else {
            NodoPalabra aux = this.Primero;
            while (aux != null) {
                salida += " " + aux.getDato();
                aux = aux.getSiguiente();
                //looop
            }
        }
        return salida;
    }

    /*Variantes agregadas a los metodos basicos.*/
    //PRE:
    //POS: Agrega un nuevo Nodo al Ultimoal de la lista
    @Override
    public void agregarFinal(Object dato) {
        //NodoLista nuevo= new NodoLista(n);
        if (this.esVacia()) {
            this.agregarInicio(dato); // el agregar Primero suma 1 a cantelementos
        } else {
            NodoPalabra nuevo = (NodoPalabra) dato; // new NodoPalabra(dato);
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
                NodoPalabra aux = this.Primero;
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
        NodoPalabra n = (NodoPalabra) dato; // new NodoPalabra(dato);
        if (this.esVacia() || this.Primero.getDato().toString().compareToIgnoreCase(n.getDato().toString()) > 0) {
            // A.compareToIgnoreCase(B) - Si A > B entonces el valor retorno es +1, siendo B el dato nuevo a ingresar  
            this.agregarInicio(n);
        } else if (this.Ultimo.getDato().toString().compareToIgnoreCase(n.getDato().toString()) < 0) {
            // A.compareToIgnoreCase(B) - Si A < B entonces el valor retorno es -1, siendo B el dato nuevo a ingresar
            this.agregarFinal(n);
        } else {
            NodoPalabra aux = this.Primero;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().toString().compareToIgnoreCase(n.getDato().toString()) < 0) {
                aux.getSiguiente();
            }
            n.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(n);
        }
    }

    //PRE: lista ordenada
    //POS: Borra la primer ocurrencia de un elemento dado
    public void borrarElemento(Object dato) {
        // implementar el metodo

        if (this.Primero != null) {
            NodoPalabra aux = this.Primero;

            while (aux != null) {
                if (aux.equals(dato)) {
                    this.borrarInicio();
                } else {
                    while (aux.getSiguiente() != null && !aux.getSiguiente().equals(dato)) {
                        aux = aux.getSiguiente();
                    }
                    if (aux.getSiguiente() != null) {
                        NodoPalabra borrar = aux.getSiguiente();
                        aux.setSiguiente(borrar.getSiguiente());
                        //borrar.setSiguiente(null);
                    }
                }
                aux = aux.getSiguiente();
            }

//            ojo q debe actualizar cant elementos
        }
    }

    public void borrarElemento1(Object dato) {
        // implementar el metodo

        if (this.Primero != null) {
            NodoPalabra aux = this.Primero;

            while (aux != null) {
                if (aux.getDato().equals(dato)) {
                    this.borrarInicio();
                } else {
                    while (aux.getSiguiente() != null && aux.getSiguiente().getDato() != dato) {
                        aux = aux.getSiguiente();
                    }
                    if (aux.getSiguiente() != null) {
                        NodoPalabra borrar = aux.getSiguiente();
                        aux.setSiguiente(borrar.getSiguiente());
                        this.cantelementos = this.cantelementos - 1;
                        //borrar.setSiguiente(null);
                    }
                }
                aux = aux.getSiguiente();
            }

//            ojo q debe actualizar cant elementos
        }
    }

    //PRE: 
    //POS: Retorna la cantidad de nodos que tiene la lista
//    public int cantElementos() {
//        return this.cantelementos;
//    }
    //PRE: //POS:
    //PRE: //POS:
    public NodoPalabra obtenerElemento(Object dato) {
        NodoPalabra aux = this.Primero;
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
    public void mostrarREC(NodoPalabra l) {
        if (l != null) {
            System.out.println(l.getDato());
            mostrarREC(l.getSiguiente());

        }
    }

    public void agregarPalabraPorPosicion(int posicion, String Palabra) {
        //no controlo q la posicion sea 0 porque eso hace sistema 
        NodoPalabra nuevaPalabra = new NodoPalabra(Palabra);

        if (this.Primero == null) {
            this.Primero = nuevaPalabra;
            this.cantelementos = this.cantelementos + 1;

        } else if (this.Primero != null && posicion == 1) {
            this.agregarInicio(nuevaPalabra);
        } else {
            //ahora voy a recorrer la lista desde el principio
            NodoPalabra actual = this.Primero;
            NodoPalabra previo = null;

            int i = 0;
            while (i < posicion) {
                previo = actual;
                actual = actual.siguiente;
                if (actual == null) {
                    break;
                }
                i++;
            }
            //caso particular donde previo es null
            if (previo == null) {
                nuevaPalabra.siguiente = this.Primero;
                this.Primero = nuevaPalabra;
                this.cantelementos = this.cantelementos + 1;
            } else {
                nuevaPalabra.siguiente = actual;
                previo.siguiente = nuevaPalabra;
                this.cantelementos = this.cantelementos + 1;
            }
        }
    }

    public void borrarPorPosicion(int pos) {

        if (pos >= 1 && pos <= this.cantelementos) {
            //si es el primero
            if (pos == 1) {
                this.Primero = this.Primero.siguiente;
                this.cantelementos = this.cantelementos - 1;

            } else if (pos == this.cantelementos) {
                this.borrarFin();
            } else {
                NodoPalabra previo = this.buscarPorPosicion(pos - 1);
                previo.setSiguiente(previo.siguiente.siguiente);
//              previo.setSiguiente(this.buscarPorPosicion(pos).siguiente);      

                this.cantelementos = this.cantelementos - 1;

            }

        }

    }

    public NodoPalabra buscarPorPosicion(int posicionPalabra) {

        if (posicionPalabra >= 1 && posicionPalabra <= this.cantelementos) {
            if (posicionPalabra == 1) {
                return this.Primero;
            } else {
                NodoPalabra aux = this.Primero;
                for (int i = 1; i < posicionPalabra; i++) {
                    aux = aux.getSiguiente();
                }
                return aux;
            }
        } else {
            NodoPalabra aux = null;
            return aux;
        }

    }

}
