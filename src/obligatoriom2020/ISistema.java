
package obligatoriom2020;

public interface ISistema {
    
 // Funcionalidades referentes a carpeta, mensaje
 Retorno crearSistemaMensajes();
 Retorno destruirSistemaMensajes();
 Retorno AgregarCarpeta(String unidad, String carpeta);
 Retorno EliminarCarpeta(String unidad, String carpeta);
 Retorno AgregarMensaje(String unidad, String carpeta, String mensaje);
 Retorno EliminarMensaje(String unidad,String carpeta, String mensaje);
 Retorno ListarEstructura(String unidad, String carpeta);
 
 // Funcionalidades referentes a lineas, palabras, diccionario
// Retorno InsertarLinea(); 
 Retorno InsertarLinea(String unidad,String carpeta, String mensaje); 
// Retorno InsertarLineaEnPosicion(int posicionLinea); 
  Retorno InsertarLineaEnPosicion(String unidad,String carpeta, String mensaje,int posicionLinea);
// Retorno BorrarLinea(int posicionLinea);
  Retorno BorrarLinea(String unidad,String carpeta, String mensaje,int posicionLinea);
 Retorno BorrarTodo(); 
 Retorno BorrarOcurrenciasPalabraEnTexto(String palabraABorrar);
 Retorno ImprimirTexto();
 Retorno InsertarPalabraEnLinea(int posicionLinea, int posicionPalabra, String palabraAIngresar);
 Retorno InsertarPalabraYDesplazar(int posicionLinea, int posicionPalabra, String palabraAIngresar);
 Retorno BorrarPalabra(int posicionLinea, int posicionPalabra);
 Retorno BorrarOcurrenciasPalabraEnLinea(int posicionLinea, String palabraABorrar);
 Retorno ImprimirLinea(int posicionLinea);
 Retorno IngresarPalabraDiccionario(String palabraAIngresar);  
 Retorno BorrarPalabraDiccionario(String palabraABorrar);
 Retorno ImprimirDiccionario();
 Retorno ImprimirTextoIncorrecto();
 
 // Funcionalidades referentes a ejercicio complementario
 Retorno CargarDistancias(int[][] Ciudades);
 Retorno BuscarCamino ( int [][] M, String origen, String destino);
 
 
}
