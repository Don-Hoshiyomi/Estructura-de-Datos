package juegoVida;

import java.io.*;
import java.util.Scanner;

public class Lector {
    private static int tamañoArchivo = 10;
    private Arreglos genActual = new Arreglos<>(tamañoArchivo,tamañoArchivo);
    private Arreglos genFutura = new Arreglos<>(tamañoArchivo,tamañoArchivo);

    public Lector() {
    }
    public void leerArchivo(){
        try{
            Scanner archivo = new Scanner(new File("src/juegoVida/datos.csv"));
            for (int i = 0 ; i< tamañoArchivo; i++){
                String Linea[] = archivo.nextLine().split(",");
                for (int b = 0 ; b<tamañoArchivo; b ++){
                    genActual.insertarElemento(i,b,(Integer.parseInt(String.valueOf(Linea[b]))));
                }
                System.out.println();
            }

            for (int i = 0 ; i< tamañoArchivo; i++) {
                for (int b = 0; b < tamañoArchivo; b++) {
                    int prueba = (Integer) genActual.obtenerElemento(i, b);
                    boolean check = (prueba == 1);
                    genFutura.insertarElemento(i, b, new Celulas(check));
                    System.out.print(genFutura.obtenerElemento(i,b));
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void LeerVecinos(int indx1, int indx2) {
        genFutura.obtenerElemento(indx1,indx2);
        for (int i = -1 ; i<=1; i++){
            for (int b=-1 ; b<=1; b++){
                int VecinosCount = 0;
                if ((genFutura.obtenerElemento(indx1,indx2)) == "Vivo"){
                    VecinosCount++ ;
                }
            }
        }

    }
}