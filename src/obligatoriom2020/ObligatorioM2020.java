package obligatoriom2020;

public class ObligatorioM2020 {

    public static void main(String[] args) {
        // TODO code application logic here
        Sistema s = new Sistema(3);
        Prueba p = new Prueba();
        prueba1(s, p);
    }

    public static void prueba1(Sistema s, Prueba p) {

        // FUNCIONALIDAD DEL SISTEMA -------------------------------------------------------------------------------------------------------------------------
        //      CREAR SISTEMA DE MENSAJES
        p.ver(s.crearSistemaMensajes().resultado, Retorno.Resultado.OK, "Se crea sistema de mensajes");

        
        
// *******************************************************************************************************************************************************        
        p.tituloPrueba("********************************************************** OPERACIONES RELATIVAS A LA ESTRUCTURA ***");
        
        p.tituloPrueba("                       AGREGAR CARPETA A LA ESTRUCTURA DE CARPETAS - OK   ");
        // Agregar carpetas
        p.ver(s.AgregarCarpeta("C", "Archivos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Archivos en unidad C");
 //     p.ver(s.AgregarCarpeta("C", "Archivos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Archivos en unidad C");
        p.ver(s.AgregarCarpeta("C", "Docs").resultado, Retorno.Resultado.OK, "Se creo la carpeta Docs en unidad C");
        p.ver(s.AgregarCarpeta("C", "Descargas").resultado, Retorno.Resultado.OK, "Se creo la carpeta Descargas en unidad C");
        p.ver(s.ListarEstructuraUnidad("C").resultado, Retorno.Resultado.OK, "Se listan las carpetas de la unidad c: " + s.ListarEstructuraUnidad("C").valorString);
        
        p.tituloPrueba("                    AGREGAR CARPETA A LA ESTRUCTURA DE CARPETAS - ERROR   ");
        // Para que falle xq ya existe la carpeta
        p.ver(s.AgregarCarpeta("C", "Docs").resultado, Retorno.Resultado.ERROR, "Intentar crear Docs en unidad C " + s.AgregarCarpeta("C", "Docs").valorString);
        // Para que falle xq no existe la unidad
        p.ver(s.AgregarCarpeta("D", "Fotos").resultado, Retorno.Resultado.ERROR, "Intentar crear Fotos en unidad D " + s.AgregarCarpeta("D", "Fotos").valorString);
     
//        p.ver(s.AgregarCarpeta("C", "Otros Archivos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Otros Archivos en unidad C");
//        p.ver(s.ListarEstructuraUnidad("C").resultado, Retorno.Resultado.OK, "Se listan las carpetas de la unidad c: " + s.ListarEstructuraUnidad("C").valorString);


        p.tituloPrueba("                     ELIMINAR CARPETA DE LA ESTRUCTURA DE CARPETAS - OK   ");
        // Eliminamos carpeta
        p.ver(s.ListarEstructuraUnidad("C").resultado, Retorno.Resultado.OK, "Se listan las carpetas de la unidad c: " + s.ListarEstructuraUnidad("C").valorString);
        p.ver(s.EliminarCarpeta("C", "Descargas").resultado, Retorno.Resultado.OK, "Se eliminó la carpeta Descargas de la unidad C");
  // Probé eliminar tanto la primera como la ultima
        //p.ver(s.EliminarCarpeta("C", "Archivos").resultado, Retorno.Resultado.OK, "Se eliminó la carpeta Descargas de la unidad C");
//        p.ver(s.EliminarCarpeta("C", "Docs").resultado, Retorno.Resultado.OK, "Se eliminó la carpeta Descargas de la unidad C");
//        p.ver(s.EliminarCarpeta("C", "Descargas").resultado, Retorno.Resultado.OK, "Se eliminó la carpeta Descargas de la unidad C");

        p.ver(s.ListarEstructuraUnidad("C").resultado, Retorno.Resultado.OK, "Se listan las carpetas de la unidad c: " + s.ListarEstructuraUnidad("C").valorString);      
       
           
        
        p.tituloPrueba("                  ELIMINAR CARPETA DE LA ESTRUCTURA DE CARPETAS - ERROR   ");    
        // Eliminar carpeta que no existe
        p.ver(s.EliminarCarpeta("C", "Fotos").resultado, Retorno.Resultado.ERROR, "Intentar eliminar Fotos en unidad C " + s.EliminarCarpeta("C", "Fotos").valorString);
        // Eliminar carpeta de una unidad que no existe
        p.ver(s.EliminarCarpeta("D", "Fotos").resultado, Retorno.Resultado.ERROR, "Intentar eliminar Fotos en unidad D " + s.EliminarCarpeta("D", "Fotos").valorString);

        
        p.tituloPrueba("                                           AGREGAR ARCHIVO/MENSAJE - OK   ");
        // Se agregar mensajes a una carpeta
        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los mensajes de la unidad C, carpeta Archivos: " + s.ListarEstructura("C", "Archivos").valorString);
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Se agrega mensaje1 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje2").resultado, Retorno.Resultado.OK, "Se agrega mensaje2 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Se agrega mensaje3 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje4").resultado, Retorno.Resultado.OK, "Se agrega mensaje4 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje5").resultado, Retorno.Resultado.OK, "Se agrega mensaje4 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje6").resultado, Retorno.Resultado.OK, "Se agrega mensaje4 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje7").resultado, Retorno.Resultado.OK, "Se agrega mensaje4 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje8").resultado, Retorno.Resultado.OK, "Se agrega mensaje4 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje9").resultado, Retorno.Resultado.OK, "Se agrega mensaje4 en carpeta Archivos");
        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los mensajes de la unidad C, carpeta Archivos: " + s.ListarEstructura("C", "Archivos").valorString);
              
//        p.tituloPrueba("                                        AGREGAR ARCHIVO/MENSAJE - ERROR   ");
//        // Agregar mensaje a una carpeta q no existe
//        p.ver(s.AgregarMensaje("C", "Fotitos", "mensaje4").resultado, Retorno.Resultado.ERROR, "Se intenta agregar mensaje4 en carpeta Fotitos " + s.AgregarMensaje("C", "Fotitos", "mensaje4").valorString);
//        // El mensaje ya existe
//        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.ERROR, "Se intenta agregar mensaje3 en carpeta Archivos " + s.AgregarMensaje("C", "Archivos", "mensaje3").valorString);
//        // La ubicacion ya existe ???
//        // SE ENTIENDE POR UBICACION LA UNIDAD? O CARPETA Y MENSAJE YA MOSTRADOS ANTERIORMENTE?
//        
//
//        p.tituloPrueba("***                                       ELIMINAR ARCHIVO/MENSAJE - OK   "); 
//        // Eliminar mensaje
//        p.ver(s.EliminarMensaje("C", "Archivos", "mensaje4").resultado, Retorno.Resultado.OK, "Se elimina el mensaje4 de la carpeta Archivos");
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los mensajes de la unidad C, carpeta Archivos: " + s.ListarEstructura("C", "Archivos").valorString);
//        p.ver(s.EliminarMensaje("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Se elimina el mensaje1 de la carpeta Archivos");
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los mensajes de la unidad C, carpeta Archivos: " + s.ListarEstructura("C", "Archivos").valorString);
//
//        p.tituloPrueba("***                                    ELIMINAR ARCHIVO/MENSAJE - ERROR   "); 
//        // Eliminar mensaje mensaje a una carpeta q no existe
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los mensajes de la unidad C, carpeta Archivos: " + s.ListarEstructura("C", "Archivos").valorString);
//        p.ver(s.EliminarMensaje("C", "Fotitos", "mensaje3").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje3 en carpeta Fotitos " + s.EliminarMensaje("C", "Fotitos", "mensaje3").valorString);
//        // No existe el mensaje que se desea eliminar
//        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los mensajes de la unidad C, carpeta Archivos: " + s.ListarEstructura("C", "Archivos").valorString);
//        p.ver(s.EliminarMensaje("C", "Archivos", "mensaje4").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje4 en carpeta Archivos " + s.EliminarMensaje("C", "Archivos", "mensaje4").valorString);
//        // SE ENTIENDE POR UBICACION LA UNIDAD? O CARPETA Y MENSAJE YA MOSTRADOS ANTERIORMENTE?
//        
//        
////        p.tituloPrueba("                   LISTAR LA ESTRUCTURA DE CARPETAS Y SUS ARCHIVOS - OK   "); 
//        // ES NECESARIO MOSTRAR ESTO? YA SE VIENE IMPLEMENTANDO ANTERIORMENTE ???
//        // Lista la estructura o emite mensaje no hay carpetas en la estructura
//
//        
//        
//// *******************************************************************************************************************************************************       
//        p.tituloPrueba("************************************************************* OPERACIONES RELATIVAS A LAS LINEAS ***");
//
//        p.tituloPrueba("                 INSERTA UNA NUEVA LINEA VACIA AL FINAL DEL TEXTO - S/E   ");
//        // Insertamos lineas vacias 
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        
//        
//        p.tituloPrueba("         INSERTA UNA NUEVA LINEA VACIA EN LA POSICION INDICADA - OK   ");
//        p.ver(s.InsertarLineaEnPosicion("C", "Archivos", "mensaje3", 1).resultado, Retorno.Resultado.OK, "Se agrego la linea");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//
//        p.tituloPrueba("        INSERTA UNA NUEVA LINEA VACIA EN LA POSICION INDICADA - ERROR   ");
//        p.ver(s.InsertarLineaEnPosicion("C", "Archivos", "mensaje3", 10).resultado, Retorno.Resultado.ERROR, "No existe la linea indicada");
//        
//
//        p.tituloPrueba("                      BORRA LA LINEA EN LA POSICION INDICADA - OK   "); // REVISAR, NO BORRA LA PRIMER LINEA COMO EL EJEMPLO
//        // Borramos linea de una posicion y se mueven las lineas una posicion arriba
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje3", 2, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje3", 2, 2, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");      
//        p.ver(s.BorrarLinea("C", "Archivos", "mensaje3", 4).resultado, Retorno.Resultado.OK, "Linea borrada correctamente");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Texto impreso correctamente"); 
//
//        p.tituloPrueba("                    BORRA LA LINEA EN LA POSICION INDICADA - ERROR   ");
//        p.ver(s.BorrarLinea("C", "Archivos", "mensaje3", 10).resultado, Retorno.Resultado.ERROR, "No existe la linea indicada");
//        
//
//        p.tituloPrueba("                       BORRA TODAS LAS LINEAS DEL TEXTO - S/E   ");
//        // Borrar todas las lineas de un mensaje e indicar texto vacio      
//        p.ver(s.BorrarTodo("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Lineas borradas correctamente");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//       
//
//        p.tituloPrueba("               BORRA TODAS LAS OCURRENCIAS DE UNA PALABRA EN EL TEXTO - OK   ");
//        // Borramos todas las palabra2
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje5").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje5").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje5", 1, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje5", 1, 2, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje5", 2, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje5", 2, 1, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarLineaEnPosicion("C", "Archivos", "mensaje5", 2).resultado, Retorno.Resultado.OK, "Se agrego la linea");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje5", 2, 1, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje5").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        p.ver(s.BorrarOcurrenciasPalabraEnTexto("C", "Archivos", "mensaje5", "Palabra2").resultado, Retorno.Resultado.OK, "Se borrró la palabra Palabra2 del texto ");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje5").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//
//        p.tituloPrueba("             BORRA TODAS LAS OCURRENCIAS DE UNA PALABRA EN EL TEXTO - ERROR   "); // VER EN CASO DE QUE LA PALABRA NO EXISTA
////        p.ver(s.BorrarOcurrenciasPalabraEnTexto("C", "Archivos", "mensaje5", "Palabra5").resultado, Retorno.Resultado.ERROR, "La palabra a borrar no existe");
//
//
////        p.tituloPrueba("                          IMPRIME EL TEXTO POR PANTALLA - S/E  "); // ES NECESARIO? YA LO USAMOS TODO EL TIEMPO
//
//
//
//// *******************************************************************************************************************************************************
//        p.tituloPrueba("*********************************************************** OPERACIONES RELATIVAS A LAS PALABRAS ***");
// 
//        p.tituloPrueba("         INSERTA UNA PALABRA EN UNA LINEA SOLO SI LA LINEA NO ESTA LLENA - OK   "); 
//        // Insertar palabra en posicion establecida solo si la linea no esta llena
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje6").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje6", 1, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje6", 1, 2, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje6", 1, 1, "Palabra3").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje6").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//
//        p.tituloPrueba("        INSERTA UNA PALABRA EN UNA LINEA SOLO SI LA LINEA NO ESTA LLENA - ERROR   ");
//        // Para que falle porque supera el max de palabras permitidas
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje6", 1, 2, "Palabra4").resultado, Retorno.Resultado.ERROR, "Tope de palabras cumplido");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje6").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        // Para que falle porque la posicion de la linea no sea valida
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje6", 1, 0, "Palabra4").resultado, Retorno.Resultado.ERROR, s.InsertarPalabraEnLinea("C", "Archivos", "mensaje2", 1, 0, "Palabra4").valorString);
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje6", 1, 5, "Palabra4").resultado, Retorno.Resultado.ERROR, s.InsertarPalabraEnLinea("C", "Archivos", "mensaje2", 1, 5, "Palabra4").valorString);
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje6").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        // Para que falle porque la posicion de la linea no es valida
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje6", 3, 1, "Palabra5").resultado, Retorno.Resultado.ERROR, s.InsertarPalabraEnLinea("C", "Archivos", "mensaje2", 3, 1, "Palabra1").valorString);
//
//
//        p.tituloPrueba("    INSERTAR UNA PALABRA A UNA LINEA Y DESPLAZA A LA SIGUIENTE SI ES NECESARIO - OK   ");  
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje7").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje7").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje7", 1, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje7", 1, 2, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje7", 1, 3, "Palabra3").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje7").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        p.ver(s.InsertarPalabraYDesplazar("C", "Archivos", "mensaje7", 1, 3, "PalabraCasi3").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
////        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje7").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        p.ver(s.InsertarPalabraYDesplazar("C", "Archivos", "mensaje7", 1, 3, "PalabraCasi2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraYDesplazar("C", "Archivos", "mensaje7", 1, 1, "Palabra0").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
////        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje7").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        p.ver(s.InsertarPalabraYDesplazar("C", "Archivos", "mensaje7", 1, 2, "PalabraEntre0y1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje7").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        
//        p.tituloPrueba("   INSERTAR UNA PALABRA A UNA LINEA Y DESPLAZA A LA SIGUIENTE SI ES NECESARIO - ERROR   ");   
//        p.ver(s.InsertarPalabraYDesplazar("C", "Archivos", "mensaje7", 4, 3, "Palabra99").resultado, Retorno.Resultado.ERROR, "La posición de la palabra no es válida");
//        p.ver(s.InsertarPalabraYDesplazar("C", "Archivos", "mensaje7", 5, 3, "Palabra99").resultado, Retorno.Resultado.ERROR, "La posición de la línea no es válida");      
//
//
//        p.tituloPrueba("                   BORRA LA PALABRA EN LA POSICION INDICADA - OK   ");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje8").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje8").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje8", 2, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje8", 2, 2, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje8", 2, 1, "Palabra3").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje8").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        p.ver(s.BorrarPalabra("C", "Archivos", "mensaje8", 2, 1).resultado, Retorno.Resultado.OK, "Palabra borrada Correctamente");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje8").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje8").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje8", 3, 1, "Palabra3").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.BorrarPalabra("C", "Archivos", "mensaje8", 2, 1).resultado, Retorno.Resultado.OK, "Palabra borrada Correctamente");
//        p.ver(s.BorrarPalabra("C", "Archivos", "mensaje8", 2, 1).resultado, Retorno.Resultado.OK, "Palabra borrada Correctamente");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje8").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
// 
//        p.tituloPrueba("                 BORRA LA PALABRA EN LA POSICION INDICADA - ERROR   ");  // ESTOS ERRORES ROMPEN AL MOSTRARSE
//        // Borrar palabra con posición de palabra que no existe
////        p.ver(s.BorrarPalabra("C", "Archivos", "mensaje8", 1, 6).resultado, Retorno.Resultado.ERROR, "La posición de la palabra no es válida");
//        // Borrar palabra con posición de linea que no existe
////        p.ver(s.BorrarPalabra("C", "Archivos", "mensaje8", 5, 1).resultado, Retorno.Resultado.ERROR, "La posición de la linea no es válida");
//
//
//        p.tituloPrueba("          BORRA TODAS LAS OCURRENCIAS DE UNA PALABRA EN LA LINEA INDICADA - OK   "); 
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje9").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje9").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarLinea("C", "Archivos", "mensaje9").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje9", 2, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje9", 2, 2, "Palabra2").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje9", 3, 1, "Palabra1").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje9").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
//        p.ver(s.BorrarOcurrenciasPalabraEnLinea("C", "Archivos", "mensaje9", 3, "Palabra1").resultado, Retorno.Resultado.OK, "Se borro la palabra indicada");
//        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje9").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
// 
//        p.tituloPrueba("        BORRA TODAS LAS OCURRENCIAS DE UNA PALABRA EN LA LINEA INDICADA - ERROR   ");               
//        p.ver(s.BorrarOcurrenciasPalabraEnLinea("C", "Archivos", "mensaje9", 4, "Palabra1").resultado, Retorno.Resultado.ERROR, "La posicion de linea indicada no es valida");
//
//
////        p.tituloPrueba("                           IMPRIME LA LINEA POR PANTALLA - OK   "); // SERA NECESARIO? YA LO USAMOS TODO EL TIEMPO
////        p.tituloPrueba("                          IMPRIME LA LINEA POR PANTALLA - ERROR  ");
//        
//// OPCION REFERENCIA DEL JUEGO DE PRUEBAS ------------------------------------------------------------------------------------------------
////        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
////        p.ver(s.InsertarLinea().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Linea vacía insertada correctamente";
////        p.ver(s.ImprimirLinea(2).resultado, Retorno.Resultado.NO_IMPLEMENTADA, s.ImprimirLinea(2).valorString);
////        //      Insertamos dos palabras en la linea 2 y luego imprimimos en pantalla solo la linea 2
////        p.ver(s.InsertarPalabraEnLinea(2, 1, "Palabra1").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
////        p.ver(s.InsertarPalabraEnLinea(2, 2, "Palabra2").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Palabra ingresada correctamente";
////        p.ver(s.ImprimirLinea(2).resultado, Retorno.Resultado.NO_IMPLEMENTADA, s.ImprimirLinea(2).valorString);
//// ----------------------------------------------------------------------------------------------------------------------------------------


// *******************************************************************************************************************************************************
        p.tituloPrueba("*********************************************************** OPERACIONES RELATIVAS AL DICCIONARIO ***");
        
        p.tituloPrueba("                                 AGREGA UNA PALABRA AL DICCIONARIO - OK   ");
        // Ingresamos tres palabras al diccionario y luego imprimimos en pantalla las palabras que tiene el diccionario
        p.ver(s.IngresarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.IngresarPalabraDiccionario("Hojalata").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.IngresarPalabraDiccionario("Bosque").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.OK, "Diccionario impreso correctamente");

        p.tituloPrueba("                              AGREGA UNA PALABRA AL DICCIONARIO - ERROR   ");
        p.ver(s.IngresarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.ERROR, "La palabra a ingresar ya existe"); // VER, LA AGREGO DOS VECES
        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.OK, "Diccionario impreso correctamente");
        
        
        p.tituloPrueba("                                  BORRA UNA PALABRA AL DICCIONARIO - OK   ");
        // Borrar palabras de diccionario y mostrar dicionario vacio al borrarlas
        p.ver(s.BorrarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.OK, "Palabra borrada correctamente");
        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
        p.ver(s.BorrarPalabraDiccionario("Hojalata").resultado, Retorno.Resultado.OK, "Palabra borrada correctamente");
        p.ver(s.BorrarPalabraDiccionario("Bosque").resultado, Retorno.Resultado.OK, "Palabra borrada correctamente");
        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.OK, "Texto impreso correctamente");

        p.tituloPrueba("                               BORRA UNA PALABRA AL DICCIONARIO - ERROR   ");
        p.ver(s.BorrarPalabraDiccionario("Pepito").resultado, Retorno.Resultado.ERROR, "La palabra no existe en el diccionario");


        p.tituloPrueba("                MUESTRA LAS PALABRAS DEL DICCIONARIO ALFABETICAMENTE - S/E   "); // VER, LA PALABRA HOJA, HOJALATA ESTAN DANDO PROBLEMAS, DUPLICA HOJA
        // Imprimimos en pantalla el diccionario vacio y luego ingresamos tres palabras al diccionario para verlas ordenadas alfabeticamente
//        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.OK, "Diccionario impreso correctamente");
        p.ver(s.IngresarPalabraDiccionario("Brisa").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.IngresarPalabraDiccionario("Hoja").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
//        p.ver(s.IngresarPalabraDiccionario("Hojalata").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.IngresarPalabraDiccionario("Bosque").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.OK, "Diccionario impreso correctamente");
        

        p.tituloPrueba("         MUESTRA LAS PALABRAS DEL TEXTO QUE NO SE ENCUENTRAN EN EL DICCIONARIO - S/E   ");
//           Insertamos tres lineas y seis palabras 
        p.ver(s.InsertarLinea("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
        p.ver(s.InsertarLinea("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
        p.ver(s.InsertarLinea("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Linea vacía insertada correctamente");
        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje1", 2, 1, "PalabraEnDiccionario21").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje1", 2, 2, "PalabraEnDiccionario22").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje1", 1, 1, "PalabraIncorrecta11").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje1", 1, 2, "PalabraEnDiccionario12").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje1", 1, 3, "PalabraIncorrecta13").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
        p.ver(s.InsertarPalabraEnLinea("C", "Archivos", "mensaje1", 3, 1, "PalabraIncorrecta31").resultado, Retorno.Resultado.OK, "Se agrego la palabra");
        p.ver(s.ImprimirTexto("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Texto impreso correctamente");
        
        p.ver(s.IngresarPalabraDiccionario("PalabraEnDiccionario21").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.IngresarPalabraDiccionario("PalabraEnDiccionario22").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.IngresarPalabraDiccionario("PalabraEnDiccionario12").resultado, Retorno.Resultado.OK, "Palabra ingresada correctamente");
        p.ver(s.ImprimirDiccionario().resultado, Retorno.Resultado.OK, "Diccionario impreso correctamente");
        
         p.ver(s.ImprimirTextoIncorrecto().resultado, Retorno.Resultado.OK, "Palabras no encontradas en diccionario");
        
        // Resultado Esperado:
        // 1: PalabraIncorrecta11 PalabraIncorrecta13
        // 2: 
        // 3: PalabraIncorrecta31

        
// *******************************************************************************************************************************************************
        p.tituloPrueba("*********************************************************************** EJERCICIO COMPLEMENTARIO ***");
        // Buscar el camino más corto para llegar de un origen a un destino, una ciudad intermedia solamente
//        p.ver(s.BuscarCamino(s.Ciudades, "Montevideo", "NewYork").resultado, Retorno.Resultado.OK, s.BuscarCamino(s.Ciudades, "Montevideo", "NewYork").valorString);



        // FUNCIONALIDAD DEL SISTEMA -------------------------------------------------------------------------------------------------------------------------
        //      DESTRUIR SISTEMA DE MENSAJES
//        p.ver(s.destruirSistemaMensajes().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se destruye sistema");
        
        
        p.imprimirResultadosPrueba();     
        
    }

}
