import ajedrez.Tablero;
import juegoVida.Juego;
import juegoVida.Lector;

public class main {
    public static void main(String[] args) {
        Tablero a = new Tablero();
        a.IniciarTablero();
        a.ImprimirTablero();
        System.out.println();
        System.out.println();
        System.out.println();
        Lector asa = new Lector();
        asa.leerArchivo();


    }
}
