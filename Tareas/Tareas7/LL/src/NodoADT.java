public class NodoADT<T> {
    private T datos;
    private NodoADT<T> siguiente;

    public NodoADT() {
    }

    public NodoADT(T datos) {
        this.datos = datos;
    }

    public NodoADT(T datos, NodoADT<T> siguiente) {
        this.datos = datos;
        this.siguiente = siguiente;
    }

    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public NodoADT<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoADT<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Dato del Nodo: " + datos + " ¿Tiene un nodo siguiente? " + ( siguiente != null);
    }
}
