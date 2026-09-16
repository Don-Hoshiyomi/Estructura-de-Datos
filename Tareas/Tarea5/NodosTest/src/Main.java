public class Main {
    public static void main(String[] args) {
        Nodo<String> head = new Nodo<>("AI", new Nodo<>("B", new Nodo<>("C",new Nodo<>("De", new Nodo<>("Mc", new Nodo<>("Zi"))))));
        Nodo <String> puntero = head;
        try {
            while (puntero.getSiguiente() != null){
                System.out.println(puntero.toString());
                puntero = puntero.getSiguiente();
            }
            System.out.println(puntero);
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        puntero = head;
        System.out.println("________________________________");
        System.out.println("Primer dato del nodo " + puntero.getDato());
        try {
            System.out.println("________________________________");
            Thread.sleep(3000);
            while (puntero.getSiguiente() != null){
                puntero = puntero.getSiguiente();
            }
            System.out.println("Ultimo dato del nodo " + puntero);
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        puntero = head;
        try {
            System.out.println("________________________________");
            while (puntero.getDato() != "De" ){
                puntero = puntero.getSiguiente();
            }
            Nodo <String> nodotemp = new Nodo<>("Fe", puntero.getSiguiente());
            puntero.setSiguiente(nodotemp);
            puntero = head;
            while (puntero.getSiguiente() != null){
                System.out.println(puntero);
                puntero = puntero.getSiguiente();
            }
            System.out.println(puntero);
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("________________________________");
            while (puntero.getSiguiente() != null) {
                puntero = puntero.getSiguiente();
            }
            Nodo<String> nodotemp = new Nodo<>("Zz", puntero.getSiguiente());
            puntero.setSiguiente(nodotemp);
            puntero = head;
            while (puntero.getSiguiente() != null) {
                System.out.println(puntero);
                puntero = puntero.getSiguiente();
            }
            System.out.println(puntero);
            puntero= head;
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            System.out.println("________________________________");
            puntero= new Nodo<>("Aa", head);
            head = puntero;
            while (puntero.getSiguiente() != null) {
                System.out.println(puntero);
                puntero = puntero.getSiguiente();
            }
            System.out.println(puntero);
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
