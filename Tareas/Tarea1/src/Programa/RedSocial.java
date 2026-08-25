package Programa;

import java.util.ArrayList;
import java.util.Objects;

public class RedSocial {
    private String categoria;
    private String redSocial;
    private Lector muestra = new Lector();
    private String comp1;
    private String comp2;
    private ArrayList<String> mes = new ArrayList<String>();

    public RedSocial() {
        muestra.leer();
        for (int b = 3; b < 14; b++) {
            mes.add(muestra.getFilas().get(0).get(b));
        }
    }
    public RedSocial(String categoria, String redSocial) {
        this.categoria = categoria;
        this.redSocial = redSocial;
        muestra.leer();
        for (int i=0 ; i < 19 ; i++){
            this.comp1 = muestra.getFilas().get(i).get(0);
            if (Objects.equals(comp1, redSocial)){
                for (int c=1; c<14; c++){
                    this.comp2 = muestra.getFilas().get(i).get(c);
                    if (Objects.equals(categoria,comp2)){
                        for (int b=3; b<14; b++){
                            mes.add(muestra.getFilas().get(i).get(b));}
                    }
                }
            }

        }


    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }

    public ArrayList<String> getMes() {
        return mes;
    }

    public void setMes(ArrayList<String> mes) {
        this.mes = mes;
    }

    }
