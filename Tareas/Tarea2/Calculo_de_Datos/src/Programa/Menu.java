package Programa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    private int opc;
    private Scanner scn = new Scanner(System.in);
    private double prestacionActual;
    private final double prestacioDefault = 0.03;
    private double pagoHorasExtra;
    private final double pagoHorasExtraDefault = 276.5;
    private int añoActual;
    private ArrayList <Integer> datT = new ArrayList<>();

    public Menu() {
    }
    public void Iniciar(){
        do {
            System.out.println("Operaciones de Salarios");
            System.out.println("1. Calculo de Sueldo ");
            System.out.println("2. Mostrar empleados por antiguedad de mayor a menor");
            System.out.println("3. Datos completos");
            System.out.println("4. Ingresar datos diferentes para Calculos de salario");
            System.out.println("5. Salir del Programa");
            opc = scn.nextInt();
            scn.nextLine();
            Lector st = new Lector();
            st.leer();
            switch (opc){
                case 1:
                {
                    while (true){
                        System.out.println("¿Qué valores desea usar?");
                        System.out.println("Perzonalizados o Default ");
                        String r = scn.nextLine().trim().toLowerCase();

                        if (r.startsWith("p")|| r.contains("perzonalizados")){
                            if (pagoHorasExtra == 0){
                                System.out.println("Ingrese las horas extra en el menu de inicio");
                                break;
                            }else {
                            st.mostrartrabajadores(pagoHorasExtra);
                            break;}
                        } else if (r.startsWith("d")|| r.contains("default")) {
                                st.mostrartrabajadores(pagoHorasExtraDefault);
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    for(int i=0 ; i< st.getFilas().toArray().length; i++){
                        this.datT.add(st.getFilas().get(i).getAñoIngreso());
                    }
                    System.out.println("Ingrese en que orden quiere mostrar a los empleados por año de ingreso:");
                    System.out.println("Mayor a Menor o Menor a Mayor");
                    String r = scn.nextLine().trim().toLowerCase();
                    if (r.startsWith("menor")){
                        Collections.sort(datT);
                        for(int i=0 ; i< st.getFilas().toArray().length; i++){
                            System.out.println(st.getFilas().get(i).getNombreCompleto()+" "+datT.get(i));
                        }
                    } else if (r.startsWith("mayor")) {
                        datT.sort(Collections.reverseOrder());
                        System.out.println(datT);
                    }
                    break;
                case 3:
                    System.out.println("Número de Trabajador || "+"Nombre Del Trabajador || "+"Sueldo de este mes || "+"Año de ingreso ||" );
                    for(int i=0 ; i< st.getFilas().toArray().length; i++){
                        System.out.println(st.getFilas().get(i).datosCompletos());
                    }
                    break;
                case 4:
                    {
                        while (true){
                            System.out.println("Ingrese el año: ");
                            String añot = scn.nextLine();
                            try {
                                this.añoActual = (int) Double.parseDouble(añot);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor Invalido, ingrese un año correcto.");
                            }
                        }
                        while (true){
                            System.out.println("Ingrese el pago por horas extra: ");
                            String hrsext = scn.nextLine();
                            try {
                                this.pagoHorasExtra = Double.parseDouble(hrsext);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor Invalido, ingrese un número valido.");
                            }
                        }
                        while (true){
                            System.out.println("Ingrese el porcentaje de prestaciones ");
                            String por = scn.nextLine();
                            try {
                                String fin= por.replace("%"," ").trim();
                                double porcentaje = Double.parseDouble(fin);
                                this.prestacionActual = ((porcentaje)/100);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor Invalido, ingrese un porcentaje valido");
                            }
                        }
                    }
                    break;
                case 5:
                    this.opc = opc;
                    break;
                default:
                    System.out.println("Ingrese uno de los valores de las opciones");
            }

        }
        while (opc != 5);
    }
}
