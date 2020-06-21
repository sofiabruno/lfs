package obligatoriom2020;

public class ObligatorioM2020 {

    public static void main(String[] args) {
        // TODO code application logic here
        Sistema s = new Sistema(10);
        Prueba p = new Prueba();
        prueba1(s, p);
    }

    public static void prueba1(Sistema s, Prueba p) {
        
        // FUNCIONALIDAD DEL SISTEMA -------------------------------------------------------------------------------------------------------------------------
        //      CREAR SISTEMA DE MENSAJES
        p.ver(s.crearSistemaMensajes().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se crea sistema de mensajes");

        // CASOS OK     
        // OPERACIONES RELATIVAS A LA ESTRUCTURA -------------------------------------------------------------------------------------------------------------
        //      AGREGAR CARPETA A LA ESTRUCTURA DE CARPETAS     
        //      Agregar carpetas 
        p.ver(s.AgregarCarpeta("C", "Archivos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Archivos en unidad C: " + s.AgregarCarpeta("C", "Archivos").valorString);
        p.ver(s.AgregarCarpeta("C", "Archivos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Archivos en unidad C: " + s.AgregarCarpeta("C", "Archivos").valorString);
        p.ver(s.AgregarCarpeta("C", "Documentos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Documentos en unidad C: " + s.AgregarCarpeta("C", "Documentos").valorString);
        p.ver(s.AgregarCarpeta("C", "Mensajes").resultado, Retorno.Resultado.OK, "Se creo la carpeta Mensajes en unidad C: " + s.AgregarCarpeta("C", "Mensajes").valorString);
        p.ver(s.AgregarCarpeta("C", "Otros Archivos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Otros Archivos en unidad C: " + s.AgregarCarpeta("C", "Otros Archivos").valorString);
        //      Listamos par ver si la estructura es correcta
        //p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
        p.ver(s.ListarEstructuraUnidad("C").resultado, Retorno.Resultado.OK, "Se listan las carpetas de la unidad c: " + s.ListarEstructuraUnidad("C").valorString);
        
        //System.out.println("Prueba agregar carpeta " + s.AgregarCarpeta("C", "Prueba").valorString);

//        //      ELIMINAR CARPETA DE LA ESTRUCTURA DE CARPETAS
//        //      Agregamos una nueva carpeta y posteriormente la elimino
//        p.ver(s.AgregarCarpeta("C", "Carpeta Y").resultado, Retorno.Resultado.OK, "Se creo la carpeta Carpeta Y en unidad C");
//        p.ver(s.EliminarCarpeta("C", "Carpeta Y").resultado, Retorno.Resultado.OK, "Se elimina la carpeta Carpeta Y en unidad C");
//        //      Listamos la carpeta para ver que fue eliminada
//        p.ver(s.ListarEstructura("C", "Carpeta Y").resultado, Retorno.Resultado.OK, "No existe la carpeta Carpeta Y");
//
//        //      AGREGAR ARCHIVO/MENSAJE
//        //      Agregamos mensajes a una carpeta
//        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Se agrega mensaje 1 en carpeta Archivos");
//        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje2").resultado, Retorno.Resultado.OK, "Se agrega mensaje 2 en carpeta Archivos");
//        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Se agrega mensaje 3 en carpeta Archivos");
//        //      Listamos la carpeta Archivos para ver si estan los mensajes agregados.
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
//
//        //      ELIMINAR ARCHIVO/MENSAJE
//        //      Agregamos un nuevo mensaje y posteriormente lo elimino 
//        p.ver(s.AgregarMensaje("C", "Archivos", "mensajex").resultado, Retorno.Resultado.OK, "Se agrega mensaje x en carpeta Archivos");
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
//        p.ver(s.EliminarMensaje("C", "Archivos", "mensajex").resultado, Retorno.Resultado.OK, "Se  elimina mensaje x en carpeta Archivos ");
//        //      Listamos la carpeta nuevamente para ver si estan los archivos correctos.
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
//
//        //      LISTAR LA ESTRUCTURA DE CARPETAS Y SUS ARCHIVOS
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
//        p.ver(s.ListarEstructura("C", "Documentos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
//        p.ver(s.ListarEstructura("C", "Mensajes").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
//        p.ver(s.ListarEstructura("C", "Otros Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");
//        
//        
//        
//        // *******************************************************************************************************************************************
//        // ********* Aca iria la linea de codigo para indicar en que unidad, carpeta y documento(mensaje) ingresariamos las lineas, palabras *********
//        // *******************************************************************************************************************************************     
//        NodoCarpeta mensaje = (NodoCarpeta) s.unidad.getListaCarpeta().obtenerElemento("Archivos").getListamensaje().obtenerElemento("mensaje1");
//        
        
        
//        // OPERACIONES RELATIVAS A LAS LINEAS ----------------------------------------------------------------------------------------------------------------
//        //      INSERTA UNA NUEVA LINEA VACIA AL FINAL DEL TEXTO
//        //      Insertamos dos linea vacia
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      INSERTA UNA NUEVA LINEA VACIA EN LA POSICION INDICADA
//        //      Insertamos una nueva linea vacia en posicion 1 y la linea que contiene "Palabra 1" se mueve a la posicion 2
//        p.ver(s.InsertarLineaEnPosicion(1).resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Línea insertada en la posición indicada");
//        p.ver(s.InsertarPalabraEnLinea(1, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        p.ver(s.InsertarLineaEnPosicion(1).resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Línea insertada en la posición indicada");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      BORRA LA LINEA EN LA POSICION INDICADA
//        //      Borramos la linea de la posicion 1 y la linea de la posicion 2 se mueve a la posicion 1
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        p.ver(s.BorrarLinea(1).resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea borrada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      BORRA TODAS LAS LINEAS DEL TEXTO
//        //      Borramos todas las lineas del texto
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente";
//        //      Hasta aca se plantea un texto para luegar borrarlo
//        p.ver(s.BorrarTodo().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Todas las líneas del texto han sido borradas");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      BORRA TODAS LAS OCURRENCIAS DE UNA PALABRA EN EL TEXTO
//        //      Borramos todas las palabras "Palabra2" y correr las palabras en la linea 
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(1, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(1, 2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarLineaEnPosicion(2).resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Línea insertada en la posición indicada");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        //      Hasta aca se plantea un texto para luego borrar y ver como se perjudico el mismo
//        p.ver(s.BorrarOcurrenciasPalabraEnTexto("Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra borrada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      IMPRIME EL TEXTO POR PANTALLA
//        //      Mostrar texto en pantalla y "Texto vacio" cuando no contiene lineas el mensaje
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(1, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        //      Hasta aca se plantea un texto para poder verlo por pantalla, posteriormente se borra en su totalidad parar mostrar que esta vacio
//        p.ver(s.BorrarTodo().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Todas las líneas del texto han sido borradas");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//            
//        // OPERACIONES RELATIVAS A LAS PALABRAS --------------------------------------------------------------------------------------------------------------
//        //      INSERTA UNA PALABRA EN UNA LINEA SOLO SI LA LINEA NO ESTA LLENA
//        //      Insertamos dos lineas y dos palabras en la linea 2
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        //      Insertamos "Palabra3" en la linea 2 posicion 1, llegando a su maximo por linea(3 palabras)
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra3").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        //      Luego intentamos agregar una cuarta palabra en la linea 2, la cual no la dejara ingresar ya que la misma tiene 3 palabras ya
//        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra4").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      INSERTAR UNA PALABRA A UNA LINEA Y DESPLAZA A LA SIGUIENTE SI ES NECESARIO
//        //      Insertamos dos lineas y dos palabras en la linea 2
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        //      Insertamos "Palabra3" en la linea 2 posicion 1, llegando a su maximo por linea(3 palabras)
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra3").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        //      Insertamos "Palabra4" en linea 2 posicion 2, al tener el maximo de palabras, "Palabra2" se desplaza a la linea 3 posicion 1
//        p.ver(s.InsertarPalabraYDesplazar(2, 2, "Palabra4").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        //      Insertamos "Palabra5" en linea 2 posicion 3, al tener el maximo de palabras, "Palabra1" se desplaza a la linea 3 posicion 1
//        p.ver(s.InsertarPalabraYDesplazar(2, 3, "Palabra5").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      BORRA LA PALABRA EN LA POSICION INDICADA
//        //      Insertamos dos lineas y tres palabras en la linea 2
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
//        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra3").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente";      
//        //      Borramos "Palabra3", ubicada en linea 2 posicion 1
//        p.ver(s.BorrarPalabra(2, 1).resultado, Retorno.Resultado.NO_IMPLEMENTADA, s.BorrarPalabra(2, 1).valorString); 
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente"; 
//        //      Insertamos una tercer linea e ingresamos "Palabra3" en la misma, luego borramos "Palabra1" y "Palabra2"
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
//        p.ver(s.InsertarPalabraEnLinea(3, 1, "Palabra3").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
//        p.ver(s.BorrarPalabra(2, 1).resultado, Retorno.Resultado.NO_IMPLEMENTADA, s.BorrarPalabra(2, 1).valorString);
//        p.ver(s.BorrarPalabra(2, 1).resultado, Retorno.Resultado.NO_IMPLEMENTADA, s.BorrarPalabra(2, 1).valorString); 
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente"; 
//        
//        //      BORRA TODAS LAS OCURRENCIAS DE UNA PALABRA EN LA LINEA INDICADA
//        //      Insertamos dos lineas y tres palabras en la linea 2
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");  
//        //      Borramos todas las "Palabra2" que existan en la linea 2
//        p.ver(s.BorrarOcurrenciasPalabraEnLinea(2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra borrada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente");
//        
//        //      IMPRIME LA LINEA POR PANTALLA
//        //      Insertamos dos lineas e imprimimos en pantalla solo la linea 2
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
//        p.ver(s.ImprimirLinea(2).resultado, Retorno.Resultado.NO_IMPLEMENTADA, s.ImprimirLinea(2).valorString);
//        //      Insertamos dos palabras en la linea 2 y luego imprimimos en pantalla solo la linea 2
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
//        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
//        p.ver(s.ImprimirLinea(2).resultado, Retorno.Resultado.NO_IMPLEMENTADA, s.ImprimirLinea(2).valorString);
//           
//        
//        // OPERACIONES RELATIVAS AL DICCIONARIO --------------------------------------------------------------------------------------------------------------
//        //      AGREGA UNA PALABRA AL DICCIONARIO
//        //      Ingresamos tres palabras al diccionario y luego imprimimos en pantalla las palabras que tiene el diccionario
//        p.ver(s.IngresarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Hojalata").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Bosque").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Diccionario impreso correctamente");
//        
//        //      BORRA UNA PALABRA DEL DICCIONARIO
//        //      Ingresamos tres palabras al diccionario y luego borramos una palabra
//        p.ver(s.IngresarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Hojalata").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Bosque").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.BorrarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra borrada correctamente");
//        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Diccionario impreso correctamente");
//        
//        //      MUESTRA LAS PALABRAS DEL DICCIONARIO ALFABETICAMENTE
//        //      Imprimimos en pantalla el diccionario vacio
//        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Diccionario impreso correctamente");
//        //      Ingresamos tres palabras al diccionario y luego imprimimos en pantalla las palabras que tiene el diccionario ordenadas alfabeticamente
//        p.ver(s.IngresarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Hojalata").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Bosque").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Diccionario impreso correctamente");
//        
//        //      MUESTRA LAS PALABRAS DEL TEXTO QUE NO SE ENCUENTRAN EN EL DICCIONARIO
//        //      Insertamos tres lineas y seis palabras 
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra21").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra22").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(1, 1, "Palabra11").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(1, 2, "Palabra12").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(1, 3, "Palabra13").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.InsertarPalabraEnLinea(3, 1, "Palabra31").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTexto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Texto impreso correctamente"); 
//        //      Ingresamos tres palabras al diccionario y luego imprimimos en pantalla las palabras que no pertenecen al diccionario
//        p.ver(s.IngresarPalabraDiccionario("Palabra12").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Palabra21").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Palabra22").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente");
//        p.ver(s.ImprimirTextoIncorrecto().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Diccionario impreso correctamente");
//        
//      
        // EJERCICIO COMPLEMENTARIO --------------------------------------------------------------------------------------------------------------------------
//        p.ver(s.BuscarCamino(s.Ciudades, "Montevideo", "NewYork").resultado, Retorno.Resultado.OK, s.BuscarCamino(s.Ciudades, "Montevideo", "NewYork").valorString);
//
//        
//        // CASOS DE ERROR
//        //      Carpeta
//        p.ver(s.AgregarCarpeta("C", "Archivos").resultado, Retorno.Resultado.ERROR, "Error Se intento crear la carpeta Archivos en unidad C que ya existe");
//        p.ver(s.AgregarCarpeta("X", "Archivos").resultado, Retorno.Resultado.ERROR, "Error Se intento crear la carpeta Archivos en unidad X que no existe");
//        p.ver(s.EliminarCarpeta("C", "Carpeta X").resultado, Retorno.Resultado.ERROR, "Se intento borrar carpeta X que no existe");
//        p.ver(s.EliminarCarpeta("X", "Carpeta X").resultado, Retorno.Resultado.ERROR, "Se intento borrar carpeta X en unidad X que no existe");
//        //      Mensaje
//        p.ver(s.AgregarMensaje("C", "Archivos X", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intento agregar mensaje 1 en la carpeta Archivos X que no existe");
//        p.ver(s.AgregarMensaje("X", "Archivos", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intento agregar mensaje 1 en carpeta Archivos y en unidad X que no existe");
//        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intento agregar mensaje 1 en carpeta Archivos ya existente");
//        p.ver(s.EliminarMensaje("C", "Archivos X", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje 1 en la carpeta Archivos X que no existe");
//        p.ver(s.EliminarMensaje("X", "Archivos", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje 1 en carpeta Archivos y en unidad X que no existe");
//        p.ver(s.EliminarMensaje("C", "Archivos", "mensaje4").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje 4 en carpeta Archivos que no existe");
//        //      Linea
//        //      Palabra
//        //      Diccionario
        
        
        // FUNCIONALIDAD DEL SISTEMA -------------------------------------------------------------------------------------------------------------------------
        //      DESTRUIR SISTEMA DE MENSAJES
        p.ver(s.destruirSistemaMensajes().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se destruye sistema");

        p.imprimirResultadosPrueba();

    }

}
