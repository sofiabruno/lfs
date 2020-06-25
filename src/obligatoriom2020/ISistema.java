package obligatoriom2020;

public interface ISistema {

    // Funcionalidades referentes a carpeta, mensaje
    Retorno crearSistemaMensajes();

    Retorno destruirSistemaMensajes();

    Retorno AgregarCarpeta(String unidad, String carpeta);

    Retorno EliminarCarpeta(String unidad, String carpeta);

    Retorno AgregarMensaje(String unidad, String carpeta, String mensaje);

    Retorno EliminarMensaje(String unidad, String carpeta, String mensaje);

    Retorno ListarEstructura(String unidad, String carpeta);

    // Funcionalidades referentes a lineas, palabras, diccionario
// Retorno InsertarLinea(); 
    Retorno InsertarLinea(String unidad, String carpeta, String mensaje);
// Retorno InsertarLineaEnPosicion(int posicionLinea); 

    Retorno InsertarLineaEnPosicion(String unidad, String carpeta, String mensaje, int posicionLinea);
// Retorno BorrarLinea(int posicionLinea);

    Retorno BorrarLinea(String unidad, String carpeta, String mensaje, int posicionLinea);
// Retorno BorrarTodo(); 

    Retorno BorrarTodo(String unidad, String carpeta, String mensaje);

    Retorno BorrarOcurrenciasPalabraEnTexto(String unidad, String carpeta, String mensaje, String palabraABorrar);

    Retorno ImprimirTexto(String unidad, String carpeta, String mensaje);

    Retorno InsertarPalabraEnLinea(String unidad, String carpeta, String mensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);

    Retorno InsertarPalabraYDesplazar(String unidad, String carpeta, String mensaje, int posicionLinea, int posicionPalabra, String palabraAIngresar);

    Retorno BorrarPalabra(String unidad, String carpeta, String mensaje, int posicionLinea, int posicionPalabra);

    Retorno BorrarOcurrenciasPalabraEnLinea(String unidad, String carpeta, String mensaje, int posicionLinea, String palabraABorrar);

    Retorno ImprimirLinea(String unidad, String carpeta, String mensaje, int posicionLinea);

    Retorno IngresarPalabraDiccionario(String palabraAIngresar);

    Retorno BorrarPalabraDiccionario(String palabraABorrar);

    Retorno ImprimirDiccionario();

    Retorno ImprimirTextoIncorrecto(String unidad, String carpeta, String mensaje);

    // Funcionalidades referentes a ejercicio complementario
//    OJO XQ SI USAMOS ESTE SISTEMA HAY Q CORREGIR EL EJERCICIO 3
     Retorno CargarDistancias(int[][] Ciudades, String origen, String destino, int duracion);
//     Retorno BuscarCamino ( int [][] M, String origen, String destino);
  //  Retorno CargarDistancias(int[][] Ciudades);
//
//    Retorno BuscarCamino(int[][] M, String origen, String destino);
//    Retorno CargarDistancias(int[][] Ciudades, String origen, String destino, int duracion);

    Retorno BuscarCamino(int[][] M, String origen, String destino);

}
