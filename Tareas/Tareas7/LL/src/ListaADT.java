public class ListaADT<T> {
    private NodoADT<T> head;
    private NodoADT<T> cursor;
    private int tamaño;

    public ListaADT() {
    }

    public ListaADT(NodoADT<T> head) {
        this.head = head;
        this.cursor=head;
    }

    //Inicio de Metodos de diapositivas
    public void esta_Vacia (){
        if (head == null){
            System.out.println("No existen datos");
        }
        else {
            System.out.println("Los datos del 1er nodo es: "+ head.getDatos());
        }
    }

    public void get_tamaño (){
        if (head != null){
            if (tamaño == 0){
                int i = 0;
                while (cursor.getSiguiente() != null){
                    i += 1;
                    cursor = cursor.getSiguiente();
                }
                i += 1;
                cursor = head;
                this.tamaño = i;
            }
            System.out.println("Tamaño de la lista es de " + tamaño);
        }
        else {
            System.out.println("La lista no contiene ningun elemento");
        }
    }

    public void agregar(T Valor){
        if (head != null){
            while (cursor.getSiguiente() != null){
                cursor = cursor.getSiguiente();
                }
            cursor.setSiguiente(new NodoADT<>(Valor));
            cursor = head;
        }
        else
        {
            head = new NodoADT<>(Valor);
        }
    }

    public void agregarInicio(T Valor){
        if (head != null){
            head = new NodoADT<>(Valor,head);
        }
        else
        {
            head = new NodoADT<>(Valor);
        }
    }

    public void agregarFinal(T Valor){
        if (head != null){
            while (cursor.getSiguiente() != null){
                cursor = cursor.getSiguiente();
            }
            cursor.setSiguiente(new NodoADT<>(Valor));
            cursor = head;
        }
        else
        {
            System.out.println("No existe valor inicial de head");
        }
    }

    public void agregar_despues_de(T parametro,T Valor){
        if (head != null){
            while (cursor.getDatos() != parametro){
                cursor = cursor.getSiguiente();
            }
            cursor.setSiguiente(new NodoADT<>(Valor));
            cursor = head;
        }
        else
        {
            System.out.println("No existe valor inicial de head");
        }
    }

    public void buscar(T valor){
        if (head != null){
            int i = 0;
            while (cursor.getDatos() != valor){
                i += 1;
                cursor = cursor.getSiguiente();
            }
            System.out.println("El valor "+valor+" esta en la posición "+i);
            cursor = head;
        }
        else
        {
            System.out.println("No existe valor inicial de head");
        }
    }

    public void eliminar_primero(){
        if (head != null){
            head= head.getSiguiente();
            cursor = head;
        }
        else {
            System.out.println("Head es null");
        }
    }

    public void eliminar_ultimo(){
        if (head != null){
            while (cursor.getSiguiente().getSiguiente() != null){
                cursor = cursor.getSiguiente();
            }
            cursor.setSiguiente(null);
            cursor = head;
        }
        else
        {
            System.out.println("No existe valor inicial de head");
        }
    }

    public void transversal(){
        if (head != null){
            while (cursor.getSiguiente() != null){
                System.out.println(cursor.getDatos());
                cursor = cursor.getSiguiente();
            }
            System.out.println(cursor.getDatos());;
            cursor = head;
        }
        else
        {
            System.out.println("No existe valor inicial de head");
        }
    }

    public void actualizar(T valor_a_cambiar,T valor){
        if (head != null){
            int i = 0;
            while (cursor.getDatos() != valor_a_cambiar){
                cursor = cursor.getSiguiente();
            }
            cursor.setDatos(valor);
            cursor = head;
        }
        else
        {
            System.out.println("No existe valor inicial de head");
        }
    }

    public NodoADT<T> getHead() {
        return head;
    }

    public void setHead(NodoADT<T> head) {
        this.head = head;
    }

    public NodoADT<T> getCursor() {
        return cursor;
    }

    public void setCursor(NodoADT<T> cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return "ListaLigada{" +
                "head=" + head + head.getSiguiente()+
                '}';
    }
}

