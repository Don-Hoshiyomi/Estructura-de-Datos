package juegoVida;

public class Juego {
    private Arreglos mapa;

    public Juego() {
    }
    public void Iniciar(){
        Lector lect = new Lector();
        lect.leerArchivo();
        for (int i = 0; i<10 ; i++){
            for (int b=0 ; b<10 ; b++){

            }
        }
        mapa = new Arreglos<>(10,10);
        Celulas cel = new Celulas(false);
        mapa.rellenar(cel);

        mapa.imprimir();
    }
}

