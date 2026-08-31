package Programa;

import java.io.*;
import java.util.ArrayList;

public class Lector {
    private Arreglos tempofilas ;
    private ArrayList <Trabajador> filas= new ArrayList<>();
    int numerotrabajador;
    String nombre;
    String apellidoP;
    String apellidoMat;
    int horasext;
    int sueldobase;
    int añoingreso;

    public Lector() {
    }

    public void leer(){
            try {
                BufferedReader BuffRead= new BufferedReader(new FileReader("Recursos/junio.dat"));
                String linea;
                BuffRead.readLine();
                while ((linea = BuffRead.readLine()) != null){
                    String[] espacios = linea.split(",");
                    int l = espacios.length;
                    tempofilas = new Arreglos(l);
                    for (int i=0 ; i< tempofilas.longitud(); i++){
                        String tempdatos = espacios[i];
                        tempofilas.insertarElemento(i,tempdatos);
                    }
                    tempofilas.transformarString();
                    for(int i=0; i< tempofilas.longitud(); i++){
                        switch (i){
                            case 0 :
                                numerotrabajador= Integer.parseInt(String.valueOf(tempofilas.obtenerElemento(i)));
                                break;
                            case 1:
                                nombre = String.valueOf(tempofilas.obtenerElemento(i));
                                break;
                            case 2:
                                apellidoP = String.valueOf(tempofilas.obtenerElemento(i));
                                break;
                            case 3:
                                apellidoMat = String.valueOf((tempofilas.obtenerElemento(i)));
                                break;
                            case 4:
                                horasext = Integer.parseInt(String.valueOf(tempofilas.obtenerElemento(i)));
                                break;
                            case 5:
                                sueldobase = Integer.parseInt(String.valueOf(tempofilas.obtenerElemento(i)));
                                break;
                            case 6:
                                añoingreso= Integer.parseInt(String.valueOf(tempofilas.obtenerElemento(i)));
                                break;
                        }
                    }

                    filas.add(new Trabajador(numerotrabajador,nombre,apellidoP,apellidoMat,horasext,sueldobase,añoingreso));
                }


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
    public void mostrartrabajadores() {
        for(int i=0 ; i< filas.toArray().length; i++){
            System.out.println(filas.get(i).toString());
        }

    }
    public void mostrartrabajadores(double horsxtr) {
        for(int i=0 ; i< filas.toArray().length; i++){
            System.out.println(filas.get(i).toString());
            System.out.println("Su salario más horas extra fue de: "+ filas.get(i).calculoHorasExtra(horsxtr));
        }

    }

    public void datostrabajadorindividual(int comprobador){
        for(int i=0 ; i< filas.toArray().length; i++){
            if (filas.get(i).getNumTrabajador() == comprobador){
                System.out.println(filas.get(i).toString());

            }
        }
    }

    public ArrayList<Trabajador> getFilas() {
        return filas;
    }

    public void setFilas(ArrayList<Trabajador> filas) {
        this.filas = filas;
    }

}

