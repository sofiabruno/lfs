package obligatoriom2020;

public class Sistema implements ISistema {

    @Override
    public Retorno crearSistemaMensajes() {
        Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno destruirSistemaMensajes() {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno AgregarCarpeta(String unidad, String carpeta) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno EliminarCarpeta(String unidad, String carpeta) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno AgregarMensaje(String unidad, String carpeta, String mensaje) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }
    @Override
    public Retorno EliminarMensaje(String unidad, String carpeta, String mensaje) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno ListarEstructura(String unidad, String carpeta) {
         Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

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
          Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

    @Override
    public Retorno BuscarCamino(int[][] M, String origen, String destino) {
          Retorno ret = new Retorno(Retorno.Resultado.NO_IMPLEMENTADA);
        return ret;

    }

}
