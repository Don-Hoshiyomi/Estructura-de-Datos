package Programa;

public class Logica {
    private int suma;
    private int resta;
    private double promedio;
    private int num1;
    private int num2;

    public Logica() {
    }
    public int suma(int num1, int num2){
        suma = num1+num2;
        return suma;
    }
    public int resta(int num1, int num2){
        resta = (num1-num2);
        if (resta < 0 )
            resta= resta*-1;
        return resta;
    }
    public double promedio(double num1,double num2){
        promedio= (num1+num2)/2;
        return promedio;
    }
    public double promedio(double num1,double num2,double num3){
        promedio = (num1+num2+num3)/2;
        return promedio;
    }
}
