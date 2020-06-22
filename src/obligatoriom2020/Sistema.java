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
                ret.valorString = "Se agrego la carpeta +" + carpeta + "a la unidad " + unidad;
            } else {
//                ret.resultado = Retorno.Resultado.ERROR;
                 ret.valorString = "La carpeta +" + carpeta + "ya existe en la unidad " + unidad;
            }
        } else {
//            ret.resultado = Retorno.Resultado.ERROR;
                 ret.valorString = "No existe la unidad";

        }


        return ret;

    }

    @Override
    public Retorno EliminarCarpeta(String unidad, String carpeta) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        if (uni != null) {
            if (uni.listaCarpeta.buscarelemento(carpeta)) {
                uni.listaCarpeta.borrarElemento(carpeta);
            }
        }
        return ret;

    }

    @Override
    public Retorno AgregarMensaje(String unidad, String carpeta, String mensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        if (uni != null && carpe != null) {
            if (carpe.listamensaje.obtenerElemento(mensaje) != null) {
                carpe.listamensaje.agregarFinal(mensaje);
//                mensaje agregado                
            } else {
                ret.resultado = Retorno.Resultado.ERROR;

//            el mensaje ya existe
            }
        } else {
            ret.resultado = Retorno.Resultado.ERROR;
//                la carpeta o la unidad no existen
        }

        return ret;

    }

    @Override
    public Retorno EliminarMensaje(String unidad, String carpeta, String mensaje) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        if (uni != null && carpe != null) {
            if (carpe.listamensaje.obtenerElemento(mensaje) != null) {
                carpe.listamensaje.borrarElemento(mensaje);
            }
        }

        return ret;

    }

    @Override
    public Retorno ListarEstructura(String unidad, String carpeta) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
//        
//        Object ubicacion = new Object(),
//                miUnidad = unidad,
//                miCarpeta = carpeta;
//        
//        Nodo aux = new Nodo(ubicacion);
//                     
//        while (aux!=null){
//               ret.valorString = (String) aux.getDato();
//               aux=aux.siguiente;            
//        }

        NodoUnidad uni = (NodoUnidad) listaUnidades.obtenerElemento(unidad);
        NodoCarpeta carpe = uni.listaCarpeta.obtenerElemento(carpeta);
        if (uni != null) {
            if (carpe != null) {
                ret.valorString = (String) carpe.getDato();

            } else {
                ret.valorString = "No existe la carpeta";
            }
        } else {
            ret.valorString = "No existe la unidad";
        }

        return ret;

    }

//    public Retorno ListarEstructuraUnidad(String unidad) {
//        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
//
//        Object ubicacion = new Object(),
//                miUnidad = unidad;
//
//        Nodo aux = new Nodo(ubicacion);
//
//        while (aux != null) {
//            ret.valorString = (aux.getDato().toString());
//            aux = aux.siguiente;
//        }
//
//        return ret;
//
//    }

//    Estos metodos supongo que ya lo estoy aplicando en una unidad/Carpeta/mensaje
    
    
    @Override
    public Retorno InsertarLinea() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno InsertarLineaEnPosicion(int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno BorrarLinea(int posicionLinea) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno BorrarTodo() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnTexto(String palabraABorrar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno ImprimirTexto() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno InsertarPalabraEnLinea(int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
               
        return ret;

    }

    @Override
    public Retorno InsertarPalabraYDesplazar(int posicionLinea, int posicionPalabra, String palabraAIngresar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        
        
        
        return ret;

    }

    @Override
    public Retorno BorrarPalabra(int posicionLinea, int posicionPalabra) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno BorrarOcurrenciasPalabraEnLinea(int posicionLinea, String palabraABorrar) {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno ImprimirLinea(int posicionLinea) {
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
