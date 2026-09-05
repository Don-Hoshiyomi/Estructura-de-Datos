package Programa;

public class Trabajador {
    private int numTrabajador;
    private String nombre;
    private String apellPaterno;
    private String apellMaterno;
    private int horasExtra;
    private int sueldoBase;
    private int añoIngreso;
    private double sueldoHorasExt;
    private double prestaciones;
    private String nombreCompleto = (nombre+" "+apellPaterno+" "+apellMaterno);

    public Trabajador(int numTrabajador, String nombre, String apellPaterno, String apellMaterno, int horasExtra, int sueldoBase, int añoIngreso) {
        this.numTrabajador = numTrabajador;
        this.nombre = nombre;
        this.apellPaterno = apellPaterno;
        this.apellMaterno = apellMaterno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.añoIngreso = añoIngreso;
        this.nombreCompleto= nombre+" "+ apellPaterno+" "+apellMaterno;
    }
    public double calculoHorasExtra(double horasextra){
        this.sueldoHorasExt= (sueldoBase+(horasextra*horasExtra));
        return (sueldoBase+(horasextra*horasExtra));
    }
    public double calculoPrestacion(double prestacionActual, int añoActual){
        int difDeAños = Math.abs(añoActual-añoIngreso);
        this.prestaciones= (prestacionActual*difDeAños);
        return (prestacionActual*difDeAños);
    }
    public String datosCompletos(){
        String text;
        if (sueldoHorasExt == 0){
            text = (numTrabajador +" "+ nombreCompleto+ " "+ sueldoBase+" "+ añoIngreso);
        }
        else {
            text = (numTrabajador +" "+ nombreCompleto+ " "+ sueldoHorasExt+" "+ añoIngreso);
        }
        return text;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellPaterno() {
        return apellPaterno;
    }

    public void setApellPaterno(String apellPaterno) {
        this.apellPaterno = apellPaterno;
    }

    public String getApellMaterno() {
        return apellMaterno;
    }

    public void setApellMaterno(String apellMaterno) {
        this.apellMaterno = apellMaterno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public double getSueldoHorasExt() {
        return sueldoHorasExt;
    }

    public void setSueldoHorasExt(double sueldoHorasExt) {
        this.sueldoHorasExt = sueldoHorasExt;
    }

    public double getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(double prestaciones) {
        this.prestaciones = prestaciones;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Trabajador "+ numTrabajador +
                " Nombre: " + nombre + " " + apellPaterno + " " + apellMaterno;
    }
}
