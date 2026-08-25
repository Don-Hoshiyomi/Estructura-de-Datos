package Programa;

import java.io.*;
import java.util.ArrayList;

public class Lector {
    private String nombrearch;
    private File a;
    private FileInputStream tabla=null;
    private ArrayList <ArrayList<String>> filas= new ArrayList<>();

    public Lector() {
    }
    public void leer(){
        try {
            FileInputStream tabla = new FileInputStream("Recursos/datos_redes_sociales (1).csv");
            BufferedReader lector = new BufferedReader(new InputStreamReader(tabla));
            String linea;
            for ( int i= 0; i !=19; i++){
                while ((linea = lector.readLine()) != null) {
                    ArrayList <String> orden = new ArrayList<>();
                    String[] partes = linea.split(",");
                        for (String parte : partes) {
                            orden.add(parte.trim());
                        }
                    filas.add(orden);
                    }
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

    public ArrayList<ArrayList<String>> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<ArrayList<String>> filas) {
        this.filas = filas;
    }
}