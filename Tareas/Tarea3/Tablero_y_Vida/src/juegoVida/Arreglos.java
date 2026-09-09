package juegoVida;

public class Arreglos <T>{

    private int columnas;
    private Object[][] datos;
    private int filas;

    public Arreglos(int fil, int col){
        this.filas = fil;
        this.columnas = col;
        datos= new Object[filas][columnas];
    }

    public T obtenerElemento(int indx1, int indx2){
        if((indx1 >= 0 && indx1 < filas ) && (indx2 >= 0 && indx2 < columnas)) {
            return (T) datos[indx1][indx2];
        }else{
            System.out.println("Indice fuera de rango");
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void insertarElemento(int indx1, int indx2, T elemento){
        if((indx1 >= 0 && indx1 < filas) && (indx2 >= 0 && indx2 < columnas)){
            datos[indx1][indx2] = elemento;
        }else{
            System.out.println("Indice fuera de rango");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void rellenar(T elemento){
        for(int i = 0; i < filas; i++){
            for(int b = 0; b < columnas; b++){
                datos[i][b] = elemento;
            }

        }
    }

    public void imprimir() {
        for (int i = 0; i < filas; i++) {
            for (int b = 0; b < columnas; b++) {
                if (datos[i][b] != null) {
                    System.out.print(" " + datos[i][b].toString() + " ");
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}