package obligatoriom2020;

public interface IListaCarpeta {

    public boolean esVacia();

    public void agregarInicio(Object dato);

    public void agregarFinal(Object dato);

    public void borrarInicio();

    public void borrarFin();

    public void vaciar();

    public void mostrar();
}
