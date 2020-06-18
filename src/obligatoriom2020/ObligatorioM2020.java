package obligatoriom2020;

public class ObligatorioM2020 {

    public static void main(String[] args) {
        // TODO code application logic here
        Sistema s = new Sistema();
        Prueba p = new Prueba();
        prueba1(s, p);
    }

    public static void prueba1(Sistema s, Prueba p) {
        // casos Ok
        p.ver(s.crearSistemaMensajes().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se crea sistema de mensajes");

        // agregar carpetas 
        p.ver(s.AgregarCarpeta("C", "Archivos").resultado, Retorno.Resultado.OK, "Se creo la carpeta Archivos en unidad C");
        p.ver(s.AgregarCarpeta("C", "Documentos").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se creo la carpeta documentos en unidad C");
        p.ver(s.AgregarCarpeta("C", "Mensajes").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se creo la carpeta mensajes en unidad C");
        p.ver(s.AgregarCarpeta("C", "Otros Archivos").resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se creo la carpeta otros Archivos en unidad C");
        // listamos par ver si la estructura es correcta
        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");

        // agregamos una nueva carpeta y posteriormente la elimino
        p.ver(s.AgregarCarpeta("C", "Carpeta Y").resultado, Retorno.Resultado.OK, "Se creo la carpeta Carpeta Y en unidad C");
        p.ver(s.EliminarCarpeta("C", "Carpeta Y").resultado, Retorno.Resultado.OK, "Se elimina la carpeta Carpeta Y en unidad C");
        // listamos la carpeta para ver que fue eliminada
        p.ver(s.ListarEstructura("C", "Carpeta Y").resultado, Retorno.Resultado.OK, "No existe la carpeta Carpeta Y");

        // agregamos mensajes a una carpeta
        // Aca me parece que esta mal, segun el ejemplo del profe, seria "C", "Archivos", "archivo1" o "C", "Mensajes", "mensaje1"
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.OK, "Se agrega mensaje 1 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje2").resultado, Retorno.Resultado.OK, "Se agrega mensaje 2 en carpeta Archivos");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje3").resultado, Retorno.Resultado.OK, "Se agrega mensaje 3 en carpeta Archivos");
        // listamos la carpeta Archivos para ver si estan los mensajes agregados.
        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");

        // agregamos un nuevo mensaje y posteriormente lo elimino 
        p.ver(s.AgregarMensaje("C", "Archivos", "mensajex").resultado, Retorno.Resultado.OK, "Se agrega mensaje x en carpeta Archivos");
        p.ver(s.EliminarMensaje("C", "Archivos", "mensajex").resultado, Retorno.Resultado.OK, "Se  elimina mensaje x en carpeta Archivos ");
        // listamos la carpeta nuevamente para ver si estan los archivos correctos.
        p.ver(s.ListarEstructura("C", "Archivos").resultado, Retorno.Resultado.OK, "Se listan los documentos de la carpeta Archivos");

        
        
        
        
        
        
        // casos de error
        // carpeta
        p.ver(s.AgregarCarpeta("C", "Archivos").resultado, Retorno.Resultado.ERROR, "Error Se intento crear la carpeta Archivos en unidad C que ya existe");
        p.ver(s.AgregarCarpeta("X", "Archivos").resultado, Retorno.Resultado.ERROR, "Error Se intento crear la carpeta Archivos en unidad X que no existe");
        p.ver(s.EliminarCarpeta("C", "Carpeta X").resultado, Retorno.Resultado.ERROR, "Se intento borrar carpeta X que no existe");
        p.ver(s.EliminarCarpeta("X", "Carpeta X").resultado, Retorno.Resultado.ERROR, "Se intento borrar carpeta X en unidad X que no existe");
        // mensaje
        p.ver(s.AgregarMensaje("C", "Archivos X", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intento agregar mensaje 1 en la carpeta Archivos X que no existe");
        p.ver(s.AgregarMensaje("X", "Archivos", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intento agregar mensaje 1 en carpeta Archivos y en unidad X que no existe");
        p.ver(s.AgregarMensaje("C", "Archivos", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intento agregar mensaje 1 en carpeta Archivos ya existente");      
        p.ver(s.EliminarMensaje("C", "Archivos X", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje 1 en la carpeta Archivos X que no existe");
        p.ver(s.EliminarMensaje("X", "Archivos", "mensaje1").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje 1 en carpeta Archivos y en unidad X que no existe");
        p.ver(s.EliminarMensaje("C", "Archivos", "mensaje4").resultado, Retorno.Resultado.ERROR, "Se intenta eliminar mensaje 4 en carpeta Archivos que no existe");
      
        
        
        
        
        
        
        p.ver(s.BuscarCamino(s.Ciudades, "Montevideo", "NewYork").resultado, Retorno.Resultado.OK, s.BuscarCamino(s.Ciudades, "Montevideo", "NewYork").valorString);
        
        p.ver(s.destruirSistemaMensajes().resultado, Retorno.Resultado.NO_IMPLEMENTADA, "Se destruye sistma");

        p.imprimirResultadosPrueba();

    }

}
