public class Main {
    public static void main(String[] args) {
        //ListaADT prueba = new ListaADT(new NodoADT<>("11"));
        //System.out.println(prueba);
        //prueba.esta_Vacia();
        //prueba.get_tamaño();
        //prueba.agregarInicio("a");
        //System.out.println(prueba);
        ListaADT prueba = new ListaADT<>(new NodoADT<>("!",new NodoADT<>("12")));
        prueba.eliminar_primero();
        System.out.println(prueba);
    }
}
