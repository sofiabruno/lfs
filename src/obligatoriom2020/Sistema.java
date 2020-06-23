package obligatoriom2020;

public class Sistema implements ISistema {

    int Ciudades[][] = new int[6][6];
//    NodoUnidad unidad = new NodoUnidad("C");
//    ListaCarpeta listacarpeta;
//    ListaMensaje listamensaje;

    int MAX_CANT_PALABRAS_X_LINEA;
    ListaPalabra diccionario;
    ListaUnidad listaUnidades = null;

//    public ListaCarpeta getListacarpeta() {
//        return listacarpeta;
//    }
//
//    public void setListacarpeta(ListaCarpeta listacarpeta) {
//        this.listacarpeta = listacarpeta;
//    }
//
//    public ListaMensaje getListamensaje() {
//        return listamensaje;
//    }
//
//    public void setListamensaje(ListaMensaje listamensaje) {
//        this.listamensaje = listamensaje;
//    }
    public ListaPalabra getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(ListaPalabra diccionario) {
        this.diccionario = diccionario;
    }

    public Sistema(int MAX_CANT_PALABRAS_X_LINEA) {
        this.MAX_CANT_PALABRAS_X_LINEA = MAX_CANT_PALABRAS_X_LINEA;
    }

    public int getMAX_CANT_PALABRAS_X_LINEA() {
        return MAX_CANT_PALABRAS_X_LINEA;
    }

    public void setMAX_CANT_PALABRAS_X_LINEA(int MAX_CANT_PALABRAS_X_LINEA) {
        this.MAX_CANT_PALABRAS_X_LINEA = MAX_CANT_PALABRAS_X_LINEA;
    }

    @Override
    public Retorno crearSistemaMensajes() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        listaUnidades = new ListaUnidad();
        NodoUnidad uni = new NodoUnidad("C");
        listaUnidades.agregarInicio(uni);

        diccionario = new ListaPalabra();

        CargarDistancias(Ciudades);

        return ret;

    }

    @Override
    public Retorno destruirSistemaMensajes() {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        listaUnidades = null;

        return ret;

    }

    @Override
    public Retorno AgregarCarpeta(String unidad, String carpeta) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        if (uni != null) {
            if (!uni.listaCarpeta.buscarelemento(carpeta)) {
                uni.listaCarpeta.agregarFinal(carpeta);
                ret.valorString = "Se agregó la carpeta +" + carpeta + "a la unidad " + unidad;
            } else {
//                ret.resultado = Retorno.Resultado.ERROR;
                ret.valorString = " La carpeta " + carpeta + " ya existe en la unidad " + unidad;
            }
        } else {
//            ret.resultado = Retorno.Resultado.ERROR;
            ret.valorString = "No existe la unidad " + unidad;

        }

        return ret;

    }

    @Override
    public Retorno EliminarCarpeta(String unidad, String carpeta) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        if (uni != null) {
            if (uni.listaCarpeta.buscarelemento(carpeta)) {
                uni.listaCarpeta.borrarElemento(carpeta);
                ret.valorString = "Se eliminó la carpeta +" + carpeta + "de la unidad " + unidad;

            } else {
//                no existe la carpeta en la unidad 
                ret.valorString = " La carpeta " + carpeta + " NO existe en la unidad " + unidad;

            }
        } else {
//            la unidad esta vacia o no existe
            ret.valorString = "No existe la unidad " + unidad;
        }
        return ret;

    }

    @Override
    public Retorno AgregarMensaje(String unidad, String carpeta, String mensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        if (uni != null && carpe != null) {
            //ver si el mensaje ya noe xiste
            if (carpe.listamensaje.obtenerElemento(mensaje) == null) {
                carpe.listamensaje.agregarFinal(mensaje);
                ret.resultado = Retorno.Resultado.OK;

//                mensaje agregado                
            } else {
                ret.resultado = Retorno.Resultado.ERROR;
                ret.valorString = "El mensaje ya existe en esta carpeta";

//            el mensaje ya existe
            }
        } else {
            ret.resultado = Retorno.Resultado.ERROR;
            ret.valorString = "No existe la unidad o la carpeta";
//                la carpeta o la unidad no existen
        }
        return ret;

    }

    @Override
    public Retorno EliminarMensaje(String unidad, String carpeta, String mensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        if (uni != null && carpe != null) {
            //si existe todo y lo busco y no esta vacio
            if (carpe.listamensaje.obtenerElemento(mensaje) != null) {
                carpe.listamensaje.borrarElemento(mensaje);
                //lo borro
                ret.resultado = Retorno.Resultado.OK;
            } //            Si lo busco xo no existía el mensaje
            else {
                ret.resultado = Retorno.Resultado.ERROR;
                ret.valorString = "El mensaje que quiere borrar no existe en esta carpeta";
            }
        } else {
            ret.resultado = Retorno.Resultado.ERROR;
            ret.valorString = "No existe la unidad o la carpeta";
//                la carpeta o la unidad no existen
        }

        return ret;

    }

    @Override
    public Retorno ListarEstructura(String unidad, String carpeta) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        NodoMensaje mensAux = (NodoMensaje) carpe.listamensaje.Primero;
        String listaMensajes = "";

        while (mensAux != null) {
            listaMensajes += mensAux.getDato() + " - ";
//               ret.valorString = (String) mensAux.getDato();
            mensAux = mensAux.siguiente;
        }
        ret.valorString = listaMensajes;

        return ret;

    }

    public Retorno ListarEstructuraUnidad(String unidad) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);
        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        ListaCarpeta capretasEnLaUni = uni.listaCarpeta;
        NodoCarpeta primero = (NodoCarpeta) capretasEnLaUni.Primero;
        String salida = "";
        while (primero != null) {
            salida += primero.getDato().toString() + " - ";
            primero = primero.siguiente;
        }
        ret.valorString = salida;
        return ret;

    }

    @Override
    //insertar una linea nueva vacia al final del texto
    public Retorno InsertarLinea(String unidad, String carpeta, String mensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        NodoMensaje mensAux = (NodoMensaje) carpe.listamensaje.obtenerElemento(mensaje);

        NodoLinea lineaVacia = new NodoLinea("");

        mensAux.listaLineas.agregarFinal(lineaVacia);

        return ret;

    }

    @Override

//Inserta una línea vacía en la posición indicada y mueve todas las líneas que se encuentran a
// partir de la posición indicada, una posición más adelante.
//La posición es válida solamente si (posicionLinea >= 1) y 
//(posicionLinea <= cantidad de líneas + 1)
    public Retorno InsertarLineaEnPosicion(String unidad, String carpeta, String mensaje, int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        NodoMensaje mensAux = (NodoMensaje) carpe.listamensaje.obtenerElemento(mensaje);
        int cantLineas = mensAux.listaLineas.cantelementos;
        if (posicionLinea >= 1 && posicionLinea <= cantLineas) {

        } else {
            ret.resultado = Retorno.Resultado.ERROR;
            ret.valorString = "La posición no es válida";
        }

        return ret;

    }

    @Override

//    Borra la línea en la posición indicada y mueve todas las líneas que se encuentran a partir de la posición indicada, una posición más hacia arriba.
//La posición es válida solamente si posicionLinea existe en el texto, esto es, si posicionLinea >= 1 y posicionLinea <= cantidad de líneas.
    public Retorno BorrarLinea(String unidad, String carpeta, String mensaje, int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        NodoMensaje mensAux = (NodoMensaje) carpe.listamensaje.obtenerElemento(mensaje);

        NodoLinea nodoAborrar = mensAux.listaLineas.buscarPorPosicion(posicionLinea);
        if (posicionLinea >= 1 && posicionLinea <= mensAux.listaLineas.cantelementos) {
//            si existe la ubicacion de la linea
            if (uni != null && carpe != null && mensAux != null) {
                if (nodoAborrar != null) {
                    mensAux.listaLineas.borrarElemento(nodoAborrar);
//                    con el borrar ya se cumple lo de q todos se corren??
                } else {
//                    el nodo a borrar en la posicion indicada esta vacio
                    ret.resultado = Retorno.Resultado.ERROR;
                    ret.valorString = "El nodo que quiere borrar no existe en este mensaje";
                }
            } else {
//            no existe la ubicacion de linea
                ret.resultado = Retorno.Resultado.ERROR;
                ret.valorString = "No existe la unidad o la carpeta";
            }

        }

        return ret;

    }

    @Override
//    Borra todas las líneas del texto.
    public Retorno BorrarTodo(String unidad, String carpeta, String mensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        NodoMensaje mensAux = (NodoMensaje) carpe.listamensaje.obtenerElemento(mensaje);

        if (uni != null && carpe != null) {
            if (mensAux != null) {
                mensAux.listaLineas.vaciar();
            } else {
//                    el mensaje a borrar en la posicion indicada esta vacio
                ret.resultado = Retorno.Resultado.ERROR;
                ret.valorString = "El mensaje que quiere borrar no existe en esta unidad/Carpeta";
            }
        } else {
//            no existe la ubicacion de linea
            ret.resultado = Retorno.Resultado.ERROR;
            ret.valorString = "No existe la unidad o la carpeta";
        }

        return ret;

    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnTexto(String unidad, String carpeta, String mensaje, String palabraABorrar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override

//Muestra todas las líneas del texto con sus respectivas palabras.
//Se debe imprimir el número de línea, para cada línea
//Cuando el texto no tiene líneas se debe mostrar el mensaje "Texto vacio".
    public Retorno ImprimirTexto(String unidad, String carpeta, String mensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        NodoMensaje mensAux = (NodoMensaje) carpe.listamensaje.obtenerElemento(mensaje);

        if (mensAux.listaLineas.cantelementos == 0) {
            ret.resultado = Retorno.Resultado.OK;
//            ret.valorString = "Texto vacío";
            System.out.println("Texto vacío");

        } else {
            NodoLinea aux = mensAux.listaLineas.Primero;
            int contador = 1;
            while (aux != null) {
                System.out.println(contador + ": " + aux.listaPalabras.mostrarPalabras());
//                System.out.println(contador + ": " );
                aux = aux.siguiente;
                ret.resultado = Retorno.Resultado.OK;
                contador++;

            }

        }
        return ret;

    }

    @Override
    public Retorno InsertarPalabraEnLinea(String unidad, String carpeta, String mensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        NodoMensaje mensAux = (NodoMensaje) carpe.listamensaje.obtenerElemento(mensaje);
        NodoLinea lineAux = (NodoLinea) mensAux.listaLineas.buscarPorPosicion(posicionLinea);

        if (lineAux != null) {
            //si la posicion en la linea existe
            if (posicionPalabra >= 1) {
//                si la posicion de la palabra es valida
                if (lineAux.listaPalabras.cantelementos < MAX_CANT_PALABRAS_X_LINEA) {
                    if (posicionPalabra <= MAX_CANT_PALABRAS_X_LINEA + 1) {
                        lineAux.listaPalabras.agregarPalabraPorPosicion(posicionPalabra, palabraAIngresar);
                        ret.resultado = Retorno.Resultado.OK;
                    } else {
                        ret.resultado = Retorno.Resultado.ERROR;
                        ret.valorString = "La posicion de la palabra no puede mayor que el limite de palabras";
                    }
                } else {
                    //la linea ya tiene un maximo de palabras entonces no se puede insertar
                    ret.resultado = Retorno.Resultado.ERROR;
                    ret.valorString = "La línea a ingresar ya tiene su maximo de palabras";

                }
            } else {
                ret.resultado = Retorno.Resultado.ERROR;
                ret.valorString = "La posición de la palabra no existe";

            }

        } else {
            ret.resultado = Retorno.Resultado.ERROR;
            ret.valorString = "La posición de línea no existe en el mensaje";
        }

        return ret;

    }

    @Override
    public Retorno InsertarPalabraYDesplazar(String unidad, String carpeta, String mensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);

        return ret;

    }

    @Override
    public Retorno BorrarPalabra(String unidad, String carpeta, String mensaje, int posicionLinea, int posicionPalabra) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnLinea(String unidad, String carpeta, String mensaje, int posicionLinea, String palabraABorrar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno ImprimirLinea(String unidad, String carpeta, String mensaje, int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno IngresarPalabraDiccionario(String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno BorrarPalabraDiccionario(String palabraABorrar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno ImprimirDiccionario() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno ImprimirTextoIncorrecto() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno CargarDistancias(int[][] Ciudades) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        Ciudades[0][1] = 10;
        Ciudades[1][0] = 10;

        Ciudades[0][2] = 25;
        Ciudades[2][0] = 25;

        Ciudades[0][3] = 15;
        Ciudades[3][0] = 15;

        Ciudades[0][4] = 30;
        Ciudades[4][0] = 30;

        Ciudades[0][5] = 0;
        Ciudades[5][0] = 0;

        Ciudades[1][2] = 20;
        Ciudades[2][1] = 20;

        Ciudades[1][3] = 0;
        Ciudades[3][1] = 0;

        Ciudades[1][4] = 0;
        Ciudades[4][1] = 0;

        Ciudades[1][5] = 0;
        Ciudades[5][1] = 0;

        Ciudades[2][3] = 0;
        Ciudades[3][2] = 0;

        Ciudades[2][4] = 0;
        Ciudades[4][2] = 0;

        Ciudades[2][5] = 40;
        Ciudades[5][2] = 40;

        Ciudades[3][4] = 0;
        Ciudades[4][3] = 0;

        Ciudades[3][5] = 45;
        Ciudades[5][3] = 45;

        Ciudades[4][5] = 25;
        Ciudades[5][4] = 25;

        return ret;

    }

    @Override
    public Retorno BuscarCamino(int[][] M, String origen, String destino) {
        Retorno ret = new Retorno(Retorno.Resultado.OK);

        int suma = 9999;
        int columnas = M[0].length;
        String escala = "";
        int miorigen = ciudadanumero(origen);
        int midestino = ciudadanumero(destino);

        for (int i = 0; i < columnas; i++) {
            if (M[miorigen][i] != 0 && M[midestino][i] != 0) {
                if (M[miorigen][i] + M[midestino][i] < suma) {
                    suma = M[miorigen][i] + M[midestino][i];
                    escala = numerociudad(i);
                }
            }
        }

        ret.valorString = "El camino mas corto es: " + origen + " - " + escala + " - " + destino;

        return ret;

    }

    public int ciudadanumero(String Ciudad) {
        if (Ciudad.equals("Montevideo")) {
            return 0;
        }
        if (Ciudad.equals("Santiago")) {
            return 1;
        }
        if (Ciudad.equals("Lima")) {
            return 2;
        }
        if (Ciudad.equals("SanPablo")) {
            return 3;
        }
        if (Ciudad.equals("Panama")) {
            return 4;
        }
        if (Ciudad.equals("NewYork")) {
            return 5;
        }

        return -1;
    }

    public String numerociudad(int numeroCiudad) {

        if (numeroCiudad == 0) {
            return "Montevideo";
        }
        if (numeroCiudad == 1) {
            return "Santiago";
        }
        if (numeroCiudad == 2) {
            return "Lima";
        }
        if (numeroCiudad == 3) {
            return "SanPablo";
        }
        if (numeroCiudad == 4) {
            return "Panama";
        }
        if (numeroCiudad == 5) {
            return "NewYork";
        }

        return "";
    }

}
