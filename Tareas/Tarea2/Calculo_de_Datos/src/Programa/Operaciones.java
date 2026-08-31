package Programa;

public class Operaciones {
    private double horasExtra = 276.5;
    private double prestaciones = 0.03;
    private int horasExtraRealizadas;
    private int añodeIngreso;

    public Operaciones(int horasExtraRealizadas, int añodeIngreso) {
        this.horasExtraRealizadas = horasExtraRealizadas;
        this.añodeIngreso = añodeIngreso;
    }
    public double calculoHorasExtra(int horasExtraActual){
        return (horasExtraActual*horasExtra);
    }
    public double calculoHorasExtraD(int horasExtraDefault){
        return (horasExtraDefault*horasExtra);
    }

}
